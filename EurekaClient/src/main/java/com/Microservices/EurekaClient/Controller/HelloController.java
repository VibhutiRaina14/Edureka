package com.Microservices.EurekaClient.Controller;

import org.springframework.web.bind.annotation.GetMapping;

import com.Microservices.EurekaClient.Model.HelloService;

public class HelloController {
	@GetMapping("/get1")
	public HelloService retrieveLimit()
	{
		return new HelloService(1000,500);
	}

}
