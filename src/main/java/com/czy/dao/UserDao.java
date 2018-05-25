package com.czy.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.czy.vo.User;

public interface UserDao extends JpaRepository<User,Integer>{
}
