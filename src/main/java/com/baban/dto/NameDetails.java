package com.baban.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NameDetails {
	
	@JsonProperty("firstName")
	private String firstName = null;

	@JsonProperty("middleName")
	private String middleName = null;

	@JsonProperty("lastName")
	private String lastName = null;
}
