package com.baban.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.baban.entity.EmployeeDetailsEntity;

@Repository
@Transactional
public interface EmployeeDetailsRepository extends JpaRepository<EmployeeDetailsEntity, Long> {

	@Query(value="SELECT * FROM EMPLOYEE_DETAILS WHERE EMP_ID=?1", nativeQuery = true)
	public EmployeeDetailsEntity findEmployeedById(Integer integer);

}
