package com.te.springcoreannotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.te.springcoreannotations.bean.Address;
import com.te.springcoreannotations.bean.Employee;

@Configuration
public class EmployeeConfiguration {

	@Bean("address1")
	public Address getAddress() {
		Address address = new Address();
		address.setHno("201/A");
		address.setCity("Blr");
		address.setPincode(78345687);
		address.setCountry("India");
		return address;
	}

	@Bean("address2")
	@Primary
	public Address getAddress1() {
		Address address = new Address();
		address.setHno("201/A");
		address.setCity("Gau");
		address.setPincode(22424);
		address.setCountry("India");
		return address;
	}

	@Bean
	public Employee getEmp() {
		Employee employee = new Employee();
		employee.setEmpId(100);
		employee.setEmpName("Nilim");
		return employee;
	}
}
