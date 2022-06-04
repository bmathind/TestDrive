package com.baban.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EmployeeDetails {

	@JsonProperty("empId")
	private Integer empId = null;

	@JsonProperty("nameDetails")
	private NameDetails nameDetails = null;

	@JsonProperty("address")
	private AddressDetails address = null;

	@JsonProperty("contactDetailsList")
	private List<ContactDetails> contactDetailsList = new ArrayList<>();

	@JsonProperty("incomeDetailsList")
	private List<IncomeDetails> incomeDetailsList = new ArrayList<>();

}
