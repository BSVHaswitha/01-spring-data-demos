package com.springpeople.springdatademos.mongo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springpeople.springdatademos.mongo.persistence.Book;
import com.springpeople.springdatademos.mongo.service.BookService;

@RestController
@RequestMapping("/mongo/book")
public class BookController {

	@Autowired
	BookService bookService;
	
	@Value("${app.name}")
	
	String appName;

	@PostMapping
	@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
	public Book saveBook(@RequestBody @Valid Book entity) {
		System.out.println(appName);
		return this.bookService.saveBook(entity);
	}

}
