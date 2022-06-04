package com.baban.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DriverController {
	
	@GetMapping("/hello")
	public String retrieveHomePage() {
		return "Hello Baban! I am outside the package";
	}
}
