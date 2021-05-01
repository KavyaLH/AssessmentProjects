package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.Dto.EmployeeDto;



@Repository
@Transactional
public interface EmployeeRepo extends JpaRepository<EmployeeDto, Integer> {

	public EmployeeDto findByEmail(String email);
	
	@Query (nativeQuery = true, value= "update employeeapptable et set et.name=:name,et.contact=:contact,et.dob=:dob,et.gender=:gender  where et.email=:email")
	 @Modifying
	 public int updateEmplbyEmail(@Param("name") String name,@Param("contact") int contact,@Param("dob") String dob,@Param("gender") String gender,@Param("email") String email);
	
	

}