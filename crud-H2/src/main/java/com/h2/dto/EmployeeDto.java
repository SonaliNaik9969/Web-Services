package com.h2.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class EmployeeDto {
	
	private Long id;
	@NotBlank(message = "Full Name is Mandatory")
	@Size(min=3, max=1000, message="min length {min} and max length {max}")
	private String name;
	private String department;
	@NotNull(message = "salary must not be null")
	private Long salary;
	
	public EmployeeDto() {
		// TODO Auto-generated constructor stub
	}

	public EmployeeDto(Long id, String name, String department, Long salary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeDto [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}
	
	

}
