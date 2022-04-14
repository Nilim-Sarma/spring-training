package com.te.springcoreannotations.bean;

import java.io.Serializable;

import lombok.Data;

@Data
public class Address implements Serializable {
	private String hno;
	private String city;
	private String country;
	private Integer pincode;
}
