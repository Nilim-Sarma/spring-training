package com.te.springcoreannotations.bean;
import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.Data;

@Data
public class Employee implements Serializable {
	private Integer empId;
	private String empName;
	@Autowired
	@Qualifier("address1")
	private Address address;
}
