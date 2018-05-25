package com.czy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.czy.dao.UserDao;
import com.czy.service.UserService;
import com.czy.vo.User;
import com.czy.vo.UserForMapper;

@RestController
@EnableAutoConfiguration
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/addUser")
	public String addUser(String name){
		String result = userService.addUser(name);
		return result;
	}
	
	@RequestMapping("/getUser")
	public User getUserById(Integer id){
		System.out.println("getUserById--id:" + id);
		User user =  userService.getUser(id);
		System.out.println(user);
		return user;
	}
	
	@RequestMapping("/getAllUsers")
	public List<UserForMapper> getAllUsers(String name){
		return userService.getAllUsers(name);
	}
}

