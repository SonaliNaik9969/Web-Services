package com.demo.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.dto.UnlockUserDto;
import com.demo.service.UserService;

@RestController
@RequestMapping("/unlock")
public class UnlockUserResource {
	
	//unlock successfully
	//wrong credentials
	
	@Autowired
	private UserService userservice;
	
	@PostMapping("/user")
	public String UserUnlock(@RequestBody UnlockUserDto unlockdto) 
	{
		
		if(!unlockdto.getNewPassword().equals(unlockdto.getConfirmPassword()))
		{
			return "New Password and Confirm Password are not mathched!!!";
		}
		
		boolean status = userservice.UserUnlock(unlockdto);
		if (status) 
		{
			return "User Unlocked Successfully ";
		} else 
		{
			return "Invalid Credentials, Please Verify and Try Again";
		}
	}

}
