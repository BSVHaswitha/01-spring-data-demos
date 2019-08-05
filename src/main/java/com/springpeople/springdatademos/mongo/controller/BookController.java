package com.springpeople.springdatademos.mongo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springpeople.springdatademos.mongo.persistence.Book;
import com.springpeople.springdatademos.mongo.service.BookService;

@RestController
@RequestMapping("/mongo/book")
public class BookController {
	
	@Autowired
	BookService bookService;
	
	@PostMapping
	public Book saveBook(@RequestBody Book entity) {
		return this.bookService.saveBook(entity);
	}


}
