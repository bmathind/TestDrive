package com.baban.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "CONTACT_DETAILS")
public class ContactDetailsEntity {

	@Id
	@SequenceGenerator(name= "CON_ID_SEQ", allocationSize = 1, initialValue = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CON_ID_SEQ")
	@Column(name = "CON_ID", nullable = false)
	private Integer conId;

	@Column(name = "CONTACT_TYPE")
	private String contactType;

	@Column(name = "CONTACT_NUMBER")
	private String contactNumber;
	
	@ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
	@JoinColumn(name = "EMP_ID")
	private EmployeeDetailsEntity employeeDetailsEntity;

	public Integer getConId() {
		return conId;
	}

	public void setConId(Integer conId) {
		this.conId = conId;
	}

	public String getContactType() {
		return contactType;
	}

	public void setContactType(String contactType) {
		this.contactType = contactType;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	public EmployeeDetailsEntity getEmployeeDetailsEntity() {
		return employeeDetailsEntity;
	}

	public void setEmployeeDetailsEntity(EmployeeDetailsEntity employeeDetailsEntity) {
		this.employeeDetailsEntity = employeeDetailsEntity;
	}

}
