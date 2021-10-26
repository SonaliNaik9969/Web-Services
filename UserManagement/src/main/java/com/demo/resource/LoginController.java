package com.demo.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.dto.LoginDto;
import com.demo.service.UserService;

@RestController
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	private UserService userservice;
	
	@PostMapping
	public String login(@RequestBody LoginDto login)
	{
		String msg = userservice.loginCheckByEmailAndPassword(login.getEmail(),login.getTempPassword());
		return msg;
	}

}
