package com.basic.resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class WelcomeRestController {
	
	@GetMapping("/greet")
	public ResponseEntity<String> greet()
	{
		ResponseEntity<String> responseEntity = new ResponseEntity<String>("Hello", HttpStatus.OK);
		return responseEntity;
	}

}
