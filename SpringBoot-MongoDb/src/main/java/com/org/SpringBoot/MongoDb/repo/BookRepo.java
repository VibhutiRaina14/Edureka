package com.org.SpringBoot.MongoDb.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.org.SpringBoot.MongoDb.Model.Book;

@Repository
public interface BookRepo extends MongoRepository<Book,Integer>{
}
