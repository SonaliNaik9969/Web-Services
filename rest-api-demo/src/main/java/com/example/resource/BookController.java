package com.example.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Book;

@RestController
public class BookController {
	
	@GetMapping("/book")
	public Book newbook()
	{
		Book book = new Book(1L, "The Overstory", "Richard Powers", 2019);
		return book;
	}
	
	@PostMapping("/save")
	public Book saveBook(@RequestBody Book book)
	{
		return book;
	}
	

}
