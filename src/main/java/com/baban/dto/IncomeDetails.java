package com.baban.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IncomeDetails {
	@JsonProperty("incomeType")
	private String incomeType= null;
	
	@JsonProperty("salary")
	private Double salary= null;

}
