package com.demo.servicetest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.demo.entity.User;
import com.demo.service.UserService;
@SpringBootTest
class UserServiceTest {

	@Autowired
	private UserService userservice;
	
	@Test
	void testReadEmailBody() {
		User user = new User();
		user.setFirstName("Sonali");
		user.setLastName("Naik");
		user.setTempPassword("sonu9969");
		userservice.readEmailBodyToUnlockAccount(user);
		
	}
	@Test
	void testGenerateRandomPassword()
	{
		String generateRandomPassword = userservice.generateRandomPassword(6);
		System.out.println(generateRandomPassword);
	}

}
