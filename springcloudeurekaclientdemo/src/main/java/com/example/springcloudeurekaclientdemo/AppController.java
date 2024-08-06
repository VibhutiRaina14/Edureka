package com.example.springcloudeurekaclientdemo;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/app")
public class AppController {
	@GetMapping(path="/products")
	public Response getproducts()
	{
		
		Product p1=new Product("Apple",70000);
		Product p2=new Product("Apple1",70000);
		Product p3=new Product("Apple2",70000);
		Product p4=new Product("Apple3",70000);
		Product p5=new Product("Apple4",70000);
		ArrayList<Product> products=new ArrayList<Product>();
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		products.add(p5);
		Response response=new Response(101,"succesfull",null);
		return response;
	}

}
