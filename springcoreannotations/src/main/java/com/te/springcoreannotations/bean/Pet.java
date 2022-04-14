package com.te.springcoreannotations.bean;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.te.springcoreannotations.interfaces.Animal;

import lombok.Data;

@Data
public class Pet implements Serializable {
	private String name;
	@Autowired
	@Qualifier("dog")
	private Animal animal;
}
