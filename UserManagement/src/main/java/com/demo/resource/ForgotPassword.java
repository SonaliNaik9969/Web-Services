package com.demo.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.service.UserService;
@RestController
@RequestMapping("/reset")
public class ForgotPassword {
	
	@Autowired
	private UserService userservice;
	
	@GetMapping("/password/email/{email}")
	public String forgotPassword(@PathVariable("email") String email)
	{
		Boolean forgotPassword = userservice.forgotPassword(email);
		if(forgotPassword)
		{
			return "Credentials sent to your Email Id";
		}
		else
		{
			return "Invalid Email Id";
		}
		
	}

}
