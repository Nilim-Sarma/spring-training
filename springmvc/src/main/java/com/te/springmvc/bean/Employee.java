package com.te.springmvc.bean;

import java.io.Serializable;

import lombok.Data;

@Data
public class Employee implements Serializable {
	private String user;
	private String pass;
}
