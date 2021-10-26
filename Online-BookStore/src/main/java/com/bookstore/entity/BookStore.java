package com.bookstore.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BookStore {
	
	@Id
	private Long id;
	private String name;
	private String tempPassword;
	private String email;
	private int age;
	private String gender;
	private String address;
	
	public BookStore() {
		// TODO Auto-generated constructor stub
	}

	public BookStore(Long id, String name, String tempPassword, String email, int age, String gender, String address) {
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
		return "BookStore [id=" + id + ", name=" + name + ", tempPassword=" + tempPassword + ", email=" + email
				+ ", age=" + age + ", gender=" + gender + ", address=" + address + "]";
	}

	
	
	

}
