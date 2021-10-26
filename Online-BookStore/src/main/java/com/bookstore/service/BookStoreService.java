package com.bookstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.entity.BookStore;
import com.bookstore.repo.BookStoreRepo;

@Service
public class BookStoreService {
	
	@Autowired
	private BookStoreRepo bsRepo;
	
	public BookStore createUser(BookStore bookstore)
	{
		return bsRepo.save(bookstore);
	}
	
	public List<BookStore> readAllUsers()
	{
		return bsRepo.findAll();
	}
	
	public BookStore readUserById(Long id)
	{
		return bsRepo.findById(id).get();
	}

	public void deleteUserById(Long id)
	{
		bsRepo.deleteById(id);
	}
}
