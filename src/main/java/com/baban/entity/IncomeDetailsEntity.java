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
@Table(name = "INCOME_DETAILS")
public class IncomeDetailsEntity {
	
	@Id
	@SequenceGenerator(name= "INC_ID_SEQ", allocationSize = 1, initialValue = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "INC_ID_SEQ")
	@Column(name = "INC_ID", nullable = false)
	private Integer incId;

	@Column(name = "INCOME_TYPE")
	private String incomeType;

	@Column(name = "SALARY")
	private String salary;
	
	@ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
	@JoinColumn(name = "EMP_ID")
	private EmployeeDetailsEntity employeeDetailsEntity;

	public Integer getIncId() {
		return incId;
	}

	public void setIncId(Integer incId) {
		this.incId = incId;
	}

	public String getIncomeType() {
		return incomeType;
	}

	public void setIncomeType(String incomeType) {
		this.incomeType = incomeType;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public EmployeeDetailsEntity getEmployeeDetailsEntity() {
		return employeeDetailsEntity;
	}

	public void setEmployeeDetailsEntity(EmployeeDetailsEntity employeeDetailsEntity) {
		this.employeeDetailsEntity = employeeDetailsEntity;
	}

}
