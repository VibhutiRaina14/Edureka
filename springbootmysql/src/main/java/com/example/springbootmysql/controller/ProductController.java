package com.example.springbootmysql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootmysql.model.Product;
import com.example.springbootmysql.repository.ProductRepository;

@RestController
@RequestMapping(path="/products")
public class ProductController {
	@Autowired
	ProductRepository repository;
	@PostMapping(path="/add")
	public ResponseEntity<Response> addProduct(@RequestBody Product product)
	{
		System.out.println("Product:"+product);
		try {
			repository.save(product);
			Response response=new Response(101,"Product "+product.getName()+" Saved successfully");
			return new ResponseEntity<Response>(response,HttpStatus.OK);
		}
		catch(Exception e){
			Response response=new Response(701,"Product "+product.getName()+" Not Saved successfully"+e.getMessage());
			return new ResponseEntity<Response>(response,HttpStatus.OK);	
		}
		
		
	}

}
