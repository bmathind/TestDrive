package com.baban.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EmployeeDetails{

	@JsonProperty("empId")
	private Integer empId = null;

	@JsonProperty("nameDetails")
	private NameDetails nameDetails = new NameDetails();

	@JsonProperty("address")
	private AddressDetails address = new AddressDetails();

	@JsonProperty("contactDetailsList")
	private List<ContactDetails> contactDetailsList = new ArrayList<>();

	@JsonProperty("incomeDetailsList")
	private List<IncomeDetails> incomeDetailsList = new ArrayList<>();

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public NameDetails getNameDetails() {
		return nameDetails;
	}

	public void setNameDetails(NameDetails nameDetails) {
		this.nameDetails = nameDetails;
	}

	public AddressDetails getAddress() {
		return address;
	}

	public void setAddress(AddressDetails address) {
		this.address = address;
	}

	public List<ContactDetails> getContactDetailsList() {
		return contactDetailsList;
	}

	public void setContactDetailsList(List<ContactDetails> contactDetailsList) {
		this.contactDetailsList = contactDetailsList;
	}

	public List<IncomeDetails> getIncomeDetailsList() {
		return incomeDetailsList;
	}

	public void setIncomeDetailsList(List<IncomeDetails> incomeDetailsList) {
		this.incomeDetailsList = incomeDetailsList;
	}

}
