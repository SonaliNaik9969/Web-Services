package com.example.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/hello")
	public String hello()
	{
		return "Rest API Demo";
	}
	
	@GetMapping("/greet")
	public String greet()
	{
		return "Welcome to learn Rest API";
	}
}
