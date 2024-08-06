package com.org.SpringBoot.MongoDb.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.org.SpringBoot.MongoDb.Model.Book;
import com.org.SpringBoot.MongoDb.repo.BookRepo;

@Service
public class BookServiceImpl implements BookService {
	@Autowired
	private BookRepo bookrepo;
	@Override
	public Book AddBook(Book book) {
		// TODO Auto-generated method stub
		return bookrepo.save(book);

	}

	@Override
	public void DeleteBook(int id) {
		// TODO Auto-generated method stub
		bookrepo.deleteById(id);

	}
//	@Override
//	public Book updateBook(@PathVariable int id,@RequestBody Book book) {
//		Book b = bookrepo.findById(id);
//        book.setName(b.getName());
//        book.setAuthor(b.getAuthor());
//        //return b.map(ResponseEntity::ok);
//        return ResponseEntity.ok(updateBook);	
//	}

	@Override
	public List<Book> showAll() {
		// TODO Auto-generated method stub
		return bookrepo.findAll();
	}

}
