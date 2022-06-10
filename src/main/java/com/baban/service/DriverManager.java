package com.baban.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baban.dto.EmployeeDetails;
import com.baban.entity.EmployeeDetailsEntity;
import com.baban.repository.EmployeeDetailsRepository;

@Service
public class DriverManager {
	@Autowired
	private EmployeeDetailsRepository employeeDetailsRepository;
	@Autowired
	private EmployeeDetailsResponseParser parseEmployeeDetails;
	@Autowired
	private EmployeeDetailsRequestBuilder createEmployeeDetails;
	
	public String retrieveHomePage() {
		return "success";
	}

	public String createEmployee(EmployeeDetails employee) {
		EmployeeDetailsEntity employeeEntity = new EmployeeDetailsEntity();
		createEmployeeDetails.createEmployeeDetailsEntity(employee, employeeEntity);
		employeeDetailsRepository.save(employeeEntity);
		return "Successfully Created";
	}

	

	public EmployeeDetails retrieveEmployee(Integer empId) {
		EmployeeDetailsEntity empDBObject = employeeDetailsRepository.findEmployeedById(empId);
		if (null != empDBObject)
			return parseEmployeeDetails.parseEmployeeDetails(empDBObject);
		return null;
	}

}
