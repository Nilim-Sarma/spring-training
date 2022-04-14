package com.te.springcore.bean;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;

import lombok.Data;

@Data
public class Student implements Serializable {
	private List<String> studentNames;
	private Set<Integer> studentIds;
	private Map<Integer, String> courses;
}
