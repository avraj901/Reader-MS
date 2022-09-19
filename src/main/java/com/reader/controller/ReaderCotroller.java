package com.reader.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.reader.modal.Reader;

@RestController
public class ReaderCotroller {

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/getallbooks")
	public Reader getEmployee() {
		Reader reader = new Reader();
		List records = this.restTemplate.getForObject("http://localhost:8082/getallbooks", List.class);
		reader.setBooks(records);
		return reader;
	}
}
