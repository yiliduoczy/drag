package com.czy.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class IndexController {
	
	@RequestMapping("/indexController")
	public String indexController(){
		return "indexController";
	}
	
	public static void main(String args[]){
		SpringApplication.run(IndexController.class, args);
	}
}
