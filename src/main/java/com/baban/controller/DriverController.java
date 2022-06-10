package com.baban.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.baban.dto.EmployeeDetails;
import com.baban.service.DriverManager;

@RestController
public class DriverController {

	@Autowired
	public DriverManager driverManager;

	@GetMapping("/hello")
	public ResponseEntity<String> retrieveHomePage() {
		String message = driverManager.retrieveHomePage();
		return new ResponseEntity(message, HttpStatus.OK);
	}

	@PostMapping("/employee")
	public ResponseEntity<String> createEmployee(@RequestBody EmployeeDetails emp) {
		String message = driverManager.createEmployee(emp);
		return new ResponseEntity(message, HttpStatus.OK);
	}

	@GetMapping("/employee/{employeeID}")
	public ResponseEntity<EmployeeDetails> createEmployee(@PathVariable("employeeID") Integer empId) {
		EmployeeDetails responsePayload = driverManager.retrieveEmployee(empId);
		return new ResponseEntity(responsePayload, HttpStatus.OK);
	}
}
