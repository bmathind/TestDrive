package com.baban.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ContactDetails {
	@JsonProperty("contactType")
	private String contactType = null;
	@JsonProperty("contactNo")
	private String contactNo = null;

	public String getContactType() {
		return contactType;
	}

	public void setContactType(String contactType) {
		this.contactType = contactType;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

}
