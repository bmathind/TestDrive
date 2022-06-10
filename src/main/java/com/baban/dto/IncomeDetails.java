package com.baban.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IncomeDetails {
	@JsonProperty("incomeType")
	private String incomeType = null;

	@JsonProperty("salary")
	private Double salary = null;

	public String getIncomeType() {
		return incomeType;
	}

	public void setIncomeType(String incomeType) {
		this.incomeType = incomeType;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

}
