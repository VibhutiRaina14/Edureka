package com.springMVC;

import java.lang.annotation.Target;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.InternalResourceView;
//controller
@Controller
public class HomeController {
	@RequestMapping(value="/", method=RequestMethod.GET)
	//@GetMapping("/hi")
	public String hello()
	{
		//System.out.println("Hello");
		return "hello";
		
	}

}
