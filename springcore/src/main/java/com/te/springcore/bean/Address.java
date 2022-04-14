package com.te.springcore.bean;

import java.io.Serializable;

import lombok.Data;

@Data
public class Address implements Serializable {
	private String hno;
	private String city;
	private Integer pincode;
	private String country;
}
