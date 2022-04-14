package com.te.learningmanagementsystem.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "employee_details")
public class Employee implements Serializable {
	@Id
	private Integer empId;
	private String empName;
	private String empAddress;
	private String empPassword;
}
