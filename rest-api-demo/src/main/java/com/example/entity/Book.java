package com.example.entity;

public class Book {
	
	private Long id;
	private String title;
	private String author;
	private Integer year;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(Long id, String title, String author, Integer year) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.year = year;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Integer getyear() {
		return year;
	}

	public void seryear(Integer year) {
		this.year = year;
	}
	
	

}
