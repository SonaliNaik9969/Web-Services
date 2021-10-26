package com.basic.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.basic.dto.Student;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@GetMapping("/stud")
	public Student getStudentData()
	{
		Student stud = new Student(1L, "Sonali", "Naik", "sonalinaik1865@gmail.com");
		return stud;
	}
	
	@PostMapping("/save")
	public Student saveStudent(@RequestBody Student stud)
	{
		return stud;
	}

}
