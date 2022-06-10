package com.baban.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEE_DETAILS")
public class EmployeeDetailsEntity{
	
	@Id
	@SequenceGenerator(name= "EMP_ID_SEQ", allocationSize = 1, initialValue = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EMP_ID_SEQ")
	@Column(name = "EMP_ID", nullable = false)
	private Integer empId;

	@Column(name = "FIRST_NAME")
	private String firstName;

	@Column(name = "MIDDLE_NAME")
	private String middleName;

	@Column(name = "LAST_NAME")
	private String lastName;

	@Column(name = "CREATED_DATE")
	private Date createdDate;

	@Column(name = "CREATED_BY")
	private String createdBy;

	@OneToOne(mappedBy = "employeeDetailsEntity",orphanRemoval = true, cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private AddressDetailsEntity addressDetails = new AddressDetailsEntity();

	@OneToMany(mappedBy = "employeeDetailsEntity",orphanRemoval = true, cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	public List<IncomeDetailsEntity> incomeDetails= new ArrayList<>();

	@OneToMany(mappedBy = "employeeDetailsEntity",orphanRemoval = true, cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List<ContactDetailsEntity> contactDetails = new ArrayList<>();

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

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

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public AddressDetailsEntity getAddressDetails() {
		return addressDetails;
	}

	public void setAddressDetails(AddressDetailsEntity addressDetails) {
		this.addressDetails = addressDetails;
	}

	public List<IncomeDetailsEntity> getIncomeDetails() {
		return incomeDetails;
	}

	public void setIncomeDetails(List<IncomeDetailsEntity> incomeDetails) {
		this.incomeDetails = incomeDetails;
	}

	public List<ContactDetailsEntity> getContactDetails() {
		return contactDetails;
	}

	public void setContactDetails(List<ContactDetailsEntity> contactDetails) {
		this.contactDetails = contactDetails;
	}
	
}
