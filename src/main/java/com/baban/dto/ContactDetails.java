package com.baban.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ContactDetails {
	@JsonProperty("contactType")
	private String contactType = null;
	@JsonProperty("contactNo")
	private String contactNo = null;

}
