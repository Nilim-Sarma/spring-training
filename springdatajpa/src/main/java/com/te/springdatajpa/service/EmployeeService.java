package com.te.springdatajpa.service;
import java.util.List;

import com.te.springdatajpa.dto.Employee;

public interface EmployeeService {

	public Employee addEmployee(Employee employee);

	public Employee getEmployee(Integer empId);
	
	public List<Employee> getByDept(String dept);
	
	public List<Employee> orderByEmpName();
	
	public List<Employee> getEmpName();
	
}
