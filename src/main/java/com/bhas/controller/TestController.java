package com.bhas.controller;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

import org.hibernate.type.descriptor.java.LocalDateTimeJavaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping("/jwt")
public class TestController 
{
	// test endPoint,
	@RequestMapping(value = "/test",method = RequestMethod.GET)
	public DayOfWeek getDate()
	{
		return LocalDateTime.now().getDayOfWeek();
	}
}
