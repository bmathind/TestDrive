package com.baban.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "ADDRESS_DETAILS")
public class AddressDetailsEntity {

	@Id
	@SequenceGenerator(name= "ADD_ID_SEQ", allocationSize = 1, initialValue = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ADD_ID_SEQ")
	@Column(name = "ADD_ID", nullable = false)
	private Integer addId;

	@Column(name = "STREET_NAME")
	private String streetName;

	@Column(name = "POST")
	private String post;

	@Column(name = "STATE")
	private String state;

	@Column(name = "ZIP_CODE")
	private Integer zipCode;

	@Column(name = "LANDMARK")
	private String landmark;

	@OneToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
	@JoinColumn(name = "EMP_ID")
	private EmployeeDetailsEntity employeeDetailsEntity;

	public Integer getAddId() {
		return addId;
	}

	public void setAddId(Integer addId) {
		this.addId = addId;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getZipCode() {
		return zipCode;
	}

	public void setZipCode(Integer zipCode) {
		this.zipCode = zipCode;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	
	public EmployeeDetailsEntity getEmployeeDetailsEntity() {
		return employeeDetailsEntity;
	}

	public void setEmployeeDetailsEntity(EmployeeDetailsEntity employeeDetailsEntity) {
		this.employeeDetailsEntity = employeeDetailsEntity;
	}

}
