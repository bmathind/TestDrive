package com.baban.testdrive;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller2 {
	
	@GetMapping("/home-world")
	public String retrieveHomePage() {
		return "Hello Baban!";
	}
}
