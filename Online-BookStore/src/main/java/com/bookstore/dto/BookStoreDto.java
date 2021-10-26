package com.bookstore.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class BookStoreDto {
	
	private Long id;
	@NotBlank(message = "Full Name is mandatory")
	@Size(min=3, max =500, message = "min length {min} and max length {max}")
	private String name;
	@Size(min=8, max=15, message = "min length {min} and max length {max}")
	private String tempPassword;
	@NotBlank(message = "email should not be null")
	private String email;
	@Size(min=5, max=100, message = "Age range from {min} to {max}")
	private int age;
	private String gender;
	private String address;
	
	public BookStoreDto() {
		// TODO Auto-generated constructor stub
	}

	public BookStoreDto(Long id, String name, String tempPassword, String email, int age, String gender,
			String address) {
		super();
		this.id = id;
		this.name = name;
		this.tempPassword = tempPassword;
		this.email = email;
		this.age = age;
		this.gender = gender;
		this.address = address;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTempPassword() {
		return tempPassword;
	}

	public void setTempPassword(String tempPassword) {
		this.tempPassword = tempPassword;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "BookStoreDto [id=" + id + ", name=" + name + ", tempPassword=" + tempPassword + ", email=" + email
				+ ", age=" + age + ", gender=" + gender + ", address=" + address + "]";
	}
	
	

}
