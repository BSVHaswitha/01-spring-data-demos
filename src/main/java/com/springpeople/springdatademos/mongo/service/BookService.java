package com.springpeople.springdatademos.mongo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springpeople.springdatademos.mongo.persistence.Book;
import com.springpeople.springdatademos.mongo.repository.BookRepository;

@Service
public class BookService {
	@Autowired
	BookRepository repository;
	
	public Book saveBook(Book entity) {
		return this.repository.save(entity);
	}

}
