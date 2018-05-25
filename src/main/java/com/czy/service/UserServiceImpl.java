package com.czy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import com.czy.dao.UserDao;
import com.czy.mapper.UserMapper;
import com.czy.vo.User;
import com.czy.vo.UserForMapper;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public String addUser(String name) {
		System.out.println("addUser...");
		int i = jdbcTemplate.update("insert into user_t values(null,'" + name + "');");
		return "新增" + i + "条数据!";
	}
	
	@Override
	public User getUser(Integer id){
		return userDao.findOne(id);
	}

	@Override
	public List<UserForMapper> getAllUsers(String name) {
		return userMapper.getAllUsers(name);
	}
	

}
