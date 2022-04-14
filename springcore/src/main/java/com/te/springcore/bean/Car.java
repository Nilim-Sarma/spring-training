package com.te.springcore.bean;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class Car implements Serializable {

	private String carNo;
	private String carName;
	private Engine engine1;

//	public Car(Engine engine2) {
//		this.engine1 = engine2;
//	}
}
