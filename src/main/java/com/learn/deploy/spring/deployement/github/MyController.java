package com.learn.deploy.spring.deployement.github;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	
	@GetMapping("/")
	public String home() {
		return "welcome to home page";
	}
	
	@GetMapping("/about")
	public String about() {
		return "welcome to about page";
	}
}
