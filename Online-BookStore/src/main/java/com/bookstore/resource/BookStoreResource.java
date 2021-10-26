package com.bookstore.resource;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookstore.dto.BookStoreDto;
import com.bookstore.entity.BookStore;
import com.bookstore.service.BookStoreService;

@RestController
@RequestMapping("/bookstore")
public class BookStoreResource {
	
	@Autowired
	private BookStoreService bsService;
	
	@PostMapping("/create")
	public BookStore createUser(@Valid @RequestBody BookStoreDto bookStoreDto)
	{
		BookStore bookstore = new BookStore();
		BeanUtils.copyProperties(bookStoreDto, bookstore);
		return bsService.createUser(bookstore);
	}
	
	@GetMapping("/readAllUsers")
	public List<BookStore> readAllUsers()
	{
		return bsService.readAllUsers();
	}

	@GetMapping("/id/{id}")
	public BookStore readUserById(Long id)
	{
		return bsService.readUserById(id);
	}
	
	@DeleteMapping("/id/{id}")
	public void deleteUserById(Long id)
	{
		bsService.deleteUserById(id);
	}
}
