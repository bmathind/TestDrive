package com.baban.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AddressDetails {
	
	@JsonProperty("roadName")
	private String roadName= null;
	
	@JsonProperty("cityName")
	private String cityName= null;
	
	@JsonProperty("landmark")
	private String landmark= null;
	
	@JsonProperty("zipCode")
	private Integer zipCode= null;

}
