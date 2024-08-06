package com.org.SpringBoot.MongoDb.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.SpringBoot.MongoDb.Model.Book;
import com.org.SpringBoot.MongoDb.service.BookServiceImpl;

@RestController
@RequestMapping("book")
public class BookController {
	@Autowired
	private BookServiceImpl service;
	
	@GetMapping("/Show")
	public List<Book> showAll() {
		
		return service.showAll();
	}
	@PostMapping("/Insert")
	public void AddBook(@RequestBody Book book) {
		service.AddBook(book);
	}
	@DeleteMapping("/Delete/{id}")
	public void DeleteBook(@PathVariable("id") int id) {
	service.DeleteBook(id);
}
//@PutMapping("/Update/{id}")
//public Book updateBook(@PathVariable("id")int id,@RequestBody Book book) {
//	return service.updateBook(id,book);
//}

}
