package com.springpeople.springdatademos.mongo.persistence;

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Max;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Book {
	@NotNull
	private String isbnNo;
	private List<String> authors;
	@Max(value=25)
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
