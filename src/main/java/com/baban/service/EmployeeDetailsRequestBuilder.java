package com.baban.service;

import java.util.Date;

import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import com.baban.dto.ContactDetails;
import com.baban.dto.EmployeeDetails;
import com.baban.dto.IncomeDetails;
import com.baban.entity.AddressDetailsEntity;
import com.baban.entity.ContactDetailsEntity;
import com.baban.entity.EmployeeDetailsEntity;
import com.baban.entity.IncomeDetailsEntity;

@Component
public class EmployeeDetailsRequestBuilder {

	public void createEmployeeDetailsEntity(EmployeeDetails employeeDetails, EmployeeDetailsEntity employeeEntity) {
		setBasicEmployeeDetails(employeeDetails, employeeEntity);
		setIncomeDetails(employeeDetails, employeeEntity);
		setContactDetails(employeeDetails, employeeEntity);
		setAddressDetails(employeeDetails, employeeEntity);
	}

	private void setAddressDetails(EmployeeDetails employeeDetails, EmployeeDetailsEntity empEntity) {
		AddressDetailsEntity address = new AddressDetailsEntity();
		address.setStreetName(employeeDetails.getAddress().getRoadName());
		address.setPost(employeeDetails.getAddress().getPost());
		address.setState(employeeDetails.getAddress().getCityName());
		address.setLandmark(employeeDetails.getAddress().getLandmark());
		address.setZipCode(employeeDetails.getAddress().getZipCode());
		address.setEmployeeDetailsEntity(empEntity);
		empEntity.setAddressDetails(address);

	}

	private void setIncomeDetails(EmployeeDetails employeeDetails, EmployeeDetailsEntity empEntity) {
		IncomeDetailsEntity incomeDetails;
		if (!CollectionUtils.isEmpty(employeeDetails.getIncomeDetailsList())) {
			for (IncomeDetails income : employeeDetails.getIncomeDetailsList()) {
				incomeDetails = new IncomeDetailsEntity();
				incomeDetails.setSalary(income.getSalary().toString());
				incomeDetails.setIncomeType(income.getIncomeType());
				incomeDetails.setEmployeeDetailsEntity(empEntity);
				empEntity.getIncomeDetails().add(incomeDetails);
			}
		}
	}

	private void setContactDetails(EmployeeDetails employeeDetails, EmployeeDetailsEntity empEntity) {
		ContactDetailsEntity contactDetails;
		if (!CollectionUtils.isEmpty(employeeDetails.getContactDetailsList())) {
			for (ContactDetails contact : employeeDetails.getContactDetailsList()) {
				contactDetails = new ContactDetailsEntity();
				contactDetails.setContactNumber(contact.getContactNo());
				contactDetails.setContactType(contact.getContactType());
				contactDetails.setEmployeeDetailsEntity(empEntity);
				empEntity.getContactDetails().add(contactDetails);
			}
		}

	}

	private void setBasicEmployeeDetails(EmployeeDetails employeeDetails, EmployeeDetailsEntity empEntity) {
		empEntity.setFirstName(employeeDetails.getNameDetails().getFirstName());
		empEntity.setMiddleName(employeeDetails.getNameDetails().getMiddleName());
		empEntity.setLastName(employeeDetails.getNameDetails().getLastName());
		empEntity.setCreatedBy("Baban Biswas");
		empEntity.setCreatedDate(new Date());
	}
}
