package com.czy.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//识别该接口全部返回json格式
@EnableAutoConfiguration//开始注入spring容器
public class HelloworldController {
	
	@RequestMapping("/index")
	public String index(Map<String,Object> result){
		result.put("name", "zhansan");
		System.out.println("index method");
		List<String> list = new ArrayList<String>();
		list.add("zhangsan");
		return "index";
	}
	
	@RequestMapping("/getMap")
	public Map<String,String> getMap(){
		int i = 1/0;
		Map<String,String> map = new HashMap<String,String>();
		map.put("code", "200");
		map.put("msg", "success");
		return map;
	}
	

}
