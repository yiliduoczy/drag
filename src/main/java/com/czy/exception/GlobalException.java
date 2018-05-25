package com.czy.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalException {
	@ExceptionHandler(RuntimeException.class)
	@ResponseBody
	public Map<Object,Object> resultError(){
		Map<Object,Object> result = new HashMap<Object,Object>();
		result.put("code", 404);
		result.put("msg", "出错");
		return result;
	}
}
