package com.te.springcore.bean;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Employee implements Serializable {

	private int empId;
	private String empName;

//	private Address address;
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}

}
