package com.demo.resource;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.dto.SignUpDto;
import com.demo.entity.User;
import com.demo.service.UserService;

@RestController
@RequestMapping("/register")
public class ResourceReg {
	
	@Autowired
	private UserService userservice;
	
	@GetMapping("/country")
	public Map<Long, String> getCountry()
	{
		Map<Long, String> country = userservice.getCountry();
		return country;
	}
	
	@GetMapping("/state/countryId/{countryId}")
	public Map<Long, String> getState(@PathVariable("countryId") Long countryId)
	{
		Map<Long, String> states = userservice.getState(countryId);
		return states;
	}
	
	@GetMapping("city/stateId/{stateId}")
	public Map<Long, String> getCity(@PathVariable("stateId") Long stateId)
	{
		Map<Long, String> city = userservice.getCity(stateId);
		return city;
	}
	
	@GetMapping("/check/email/{email}")
	public String checkDuplicateEmail(@PathVariable("email") String email)
	{
		boolean status = userservice.checkDuplicateEmail(email);
		if(status)
		{
			return "Duplicate";
		}
		else
		{
			return "Unique";
		}
	}
	//@PostMapping("/save")
	//public User saveUser(@RequestBody User user)
	//{
	//	 User saveUser = userservice.saveUser(user);
	//	return saveUser;
	//}
	@PostMapping("/signup")
	public String signUpUser(@RequestBody SignUpDto signupUser)
	{
		boolean registrationStatus = userservice.signUpUser(signupUser);
		if(registrationStatus)
		{
			return "User Registration success!!!";
		}
		else
		{
			return "User Registration Failed!!!";
		}
		
	}
}
