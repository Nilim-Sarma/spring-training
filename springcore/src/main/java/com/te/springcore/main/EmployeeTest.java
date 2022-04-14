package com.te.springcore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.springcore.bean.Address;
import com.te.springcore.bean.Employee;

public class EmployeeTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("constructor.xml");
		Employee employee = (Employee) context.getBean("employee");
		System.out.println(employee);
	}
}
