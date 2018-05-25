package com.czy.service;

import java.util.List;

import com.czy.vo.User;
import com.czy.vo.UserForMapper;

public interface UserService {
	String addUser(String name );
	User getUser(Integer id);
	List<UserForMapper> getAllUsers(String name);
}
