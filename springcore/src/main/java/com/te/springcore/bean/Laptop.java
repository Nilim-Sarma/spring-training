package com.te.springcore.bean;

import java.io.Serializable;

import lombok.Data;

@Data
public class Laptop implements Serializable {

	private Person person;

	public Laptop(Person person) {
		this.person = person;
	}

}
