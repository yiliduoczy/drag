package com.czy.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableAutoConfiguration
@EnableJpaRepositories("com.czy.dao")
@ComponentScan("com.czy")
@EntityScan("com.czy.vo")  
@MapperScan("com.czy.mapper")
public class App {
	public static void main(String[] args) {
		System.out.println("hello");
		SpringApplication.run(App.class, args);//test2
	}
}
