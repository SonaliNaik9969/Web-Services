package com.demo.utiltest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.demo.util.EmailUtil;
@SpringBootTest
class EmailTest {
	
	@Autowired
	private EmailUtil emailUtil;

	@Test
	void testEmail() {
		
		emailUtil.sendEmail("sanketnaik473@gmail.com", "welcome", "Hello");
		
	}

}
