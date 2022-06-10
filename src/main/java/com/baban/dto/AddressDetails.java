package com.baban.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AddressDetails {

	@JsonProperty("roadName")
	private String roadName = null;

	@JsonProperty("cityName")
	private String cityName = null;
	
	@JsonProperty("post")
	private String post = null;
	
	@JsonProperty("landmark")
	private String landmark = null;

	@JsonProperty("zipCode")
	private Integer zipCode = null;

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public String getRoadName() {
		return roadName;
	}

	public void setRoadName(String roadName) {
		this.roadName = roadName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public Integer getZipCode() {
		return zipCode;
	}

	public void setZipCode(Integer zipCode) {
		this.zipCode = zipCode;
	}

}
