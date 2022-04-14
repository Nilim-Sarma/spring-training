package com.te.springcoreannotations.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.springcoreannotations.bean.Employee;
import com.te.springcoreannotations.config.EmployeeConfiguration;

public class EmployeeMain {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfiguration.class);
		Employee employee = context.getBean(Employee.class);
		System.out.println(employee);
	}
}
