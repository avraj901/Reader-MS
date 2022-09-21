package com.reader.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.reader.modal.Book;
import com.reader.modal.Reader;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ReaderCotroller {

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/getallbooks")
	public Reader getBooks() {
		Reader reader = new Reader();
		List records = this.restTemplate.getForObject("http://localhost:8082/getallbooks", List.class);
		reader.setBooks(records);
		return reader;
	}

	@GetMapping("/getunblockbooks")
	public List<Book> getUnBlockBooks() {
		List<Book> books = this.restTemplate.getForObject("http://localhost:8082/getunblockbooks", List.class);
		return books;
	}

}
