package com.org.SpringBoot.MongoDb.service;

import java.util.List;

import com.org.SpringBoot.MongoDb.Model.Book;

public interface BookService {
	public Book AddBook(Book book);
	public void DeleteBook(int id);
	public List<Book> showAll();
	//public Book updateBook(int id,Book book);
}
