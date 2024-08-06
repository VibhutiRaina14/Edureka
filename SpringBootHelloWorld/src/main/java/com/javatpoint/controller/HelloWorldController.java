package com.javatpoint.controller;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/hello")
public class HelloWorldController {
	
	public String hello()
	{
		return "Hello";
	}

}
