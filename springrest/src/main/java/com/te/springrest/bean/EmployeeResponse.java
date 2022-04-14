package com.te.springrest.bean;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
@Component
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmployeeResponse implements Serializable {
	private int statusCode;
	private String msg;
	private String description;
	private List<Employee> employees;
}
