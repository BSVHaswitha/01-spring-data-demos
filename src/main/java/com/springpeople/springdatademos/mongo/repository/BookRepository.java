package com.springpeople.springdatademos.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.springpeople.springdatademos.mongo.persistence.Book;

@Repository
public interface BookRepository extends MongoRepository<Book, String> {

}
