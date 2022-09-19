package com.reader.modal;

import java.util.ArrayList;

import java.util.List;



public class Reader {


	List<Book> books = new ArrayList<>();

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public Reader(List<Book> books) {
		super();
		this.books = books;
	}

	public Reader() {
		super();
		
	}
	
	
}
