package com.nagarro.devops.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	
	@GetMapping("/welcome")
	public String getMessage() {
		return "Welcome to Hello world";
	}
}
