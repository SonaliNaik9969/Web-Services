package com.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.h2.entity.Employee;
import com.h2.repo.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo empRepo;
	
	public Employee createEmployee(Employee employee)
	{
		return empRepo.save(employee);
	}
	
	public List<Employee> readAllEmployees()
	{
		return empRepo.findAll();
	}
	
	public Employee readEmployeeById(Long id)
	{
		return empRepo.findById(id).get();
	}
	
	public void deleteEmployeeById(Long id)
	{
		empRepo.deleteById(id);
	}

}
