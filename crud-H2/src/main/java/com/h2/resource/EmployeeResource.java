package com.h2.resource;

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

import com.h2.dto.EmployeeDto;
import com.h2.entity.Employee;
import com.h2.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeResource {
	
	@Autowired
	private EmployeeService empService;
	
	@PostMapping("/save")
	public Employee createEmployee(@Valid @RequestBody EmployeeDto employeeDto)
	{
		Employee employee = new Employee();
		BeanUtils.copyProperties(employeeDto, employee);
		return empService.createEmployee(employee);
	}
	
	@GetMapping("/readAll")
	public List<Employee> readAllEmployees()
	{
		return empService.readAllEmployees();
	}

	@GetMapping("/id/{id}")
	public Employee readEmployeeById(Long id)
	{
		return empService.readEmployeeById(id);
	}
	
	@DeleteMapping("/id/{id}")
	public void deleteEmployeeById(Long id)
	{
		empService.deleteEmployeeById(id);
	}
}
