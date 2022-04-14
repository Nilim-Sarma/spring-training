package com.te.springdatajpa.dto;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
@Entity
@NamedQuery(name = "Employee.getEmployeeByName", 
query = "from Employee where empName like 'R%'")
public class Employee {
	@Id
	private Integer empId;
	private String empName;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dob;
	private String password;
	private String dept;
}
