package com.baban.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NameDetails {

	@JsonProperty("firstName")
	private String firstName = null;

	@JsonProperty("middleName")
	private String middleName = null;

	@JsonProperty("lastName")
	private String lastName = null;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
