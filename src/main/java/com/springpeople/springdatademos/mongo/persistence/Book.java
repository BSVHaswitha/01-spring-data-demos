package com.springpeople.springdatademos.mongo.persistence;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Book {
	private String isbnNo;
	private List<String> authors;
	private String title;
	public String getIsbnNo() {
		return isbnNo;
	}
	public void setIsbnNo(String isbnNo) {
		this.isbnNo = isbnNo;
	}
	public List<String> getAuthors() {
		return authors;
	}
	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	

}
