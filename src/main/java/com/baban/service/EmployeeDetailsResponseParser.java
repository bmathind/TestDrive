package com.baban.service;

import org.springframework.stereotype.Component;

import com.baban.dto.AddressDetails;
import com.baban.dto.ContactDetails;
import com.baban.dto.EmployeeDetails;
import com.baban.dto.IncomeDetails;
import com.baban.dto.NameDetails;
import com.baban.entity.ContactDetailsEntity;
import com.baban.entity.EmployeeDetailsEntity;
import com.baban.entity.IncomeDetailsEntity;

@Component
public class EmployeeDetailsResponseParser {

	public EmployeeDetails parseEmployeeDetails(EmployeeDetailsEntity employeeDetailsEntity) {
		EmployeeDetails employeeDetails = new EmployeeDetails();
		employeeDetails.setEmpId(employeeDetailsEntity.getEmpId());
		setNameDetails(employeeDetailsEntity, employeeDetails);
		setIncomeDetails(employeeDetailsEntity, employeeDetails);
		setContactDetails(employeeDetailsEntity, employeeDetails);
		setAddressDetails(employeeDetailsEntity, employeeDetails);
		return employeeDetails;
	}

	private void setAddressDetails(EmployeeDetailsEntity employeeDetailsEntity, EmployeeDetails employeeDetails) {
		AddressDetails address = new AddressDetails();
		address.setCityName(employeeDetailsEntity.getAddressDetails().getState());
		address.setPost(employeeDetailsEntity.getAddressDetails().getPost());
		address.setRoadName(employeeDetailsEntity.getAddressDetails().getStreetName());
		address.setLandmark(employeeDetailsEntity.getAddressDetails().getLandmark());
		address.setZipCode(employeeDetailsEntity.getAddressDetails().getZipCode());
		employeeDetails.setAddress(address);
	}

	private void setContactDetails(EmployeeDetailsEntity employeeDetailsEntity, EmployeeDetails employeeDetails) {
		for (ContactDetailsEntity contactEntity : employeeDetailsEntity.getContactDetails()) {
			ContactDetails contact = new ContactDetails();
			contact.setContactNo(contactEntity.getContactNumber());
			contact.setContactType(contactEntity.getContactType());
			employeeDetails.getContactDetailsList().add(contact);
		}
	}

	private void setIncomeDetails(EmployeeDetailsEntity employeeDetailsEntity, EmployeeDetails employeeDetails) {
		for (IncomeDetailsEntity incomeEntity : employeeDetailsEntity.getIncomeDetails()) {
			IncomeDetails income = new IncomeDetails();
			income.setIncomeType(incomeEntity.getIncomeType());
			income.setSalary(Double.parseDouble(incomeEntity.getSalary()));
			employeeDetails.getIncomeDetailsList().add(income);
		}
	}

	private void setNameDetails(EmployeeDetailsEntity employeeDetailsEntity, EmployeeDetails employeeDetails) {
		NameDetails name = new NameDetails();
		name.setFirstName(employeeDetailsEntity.getFirstName());
		name.setMiddleName(employeeDetailsEntity.getMiddleName());
		name.setLastName(employeeDetailsEntity.getLastName());
		employeeDetails.setNameDetails(name);
	}
	

}
