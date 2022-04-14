package com.te.springrest.service;

import java.util.List;

import com.te.springrest.bean.Employee;

public interface EmployeeService {

	public Employee authenticate(Integer id, String pwd);

	public boolean addEmployee(Employee employee);

	public boolean deleteData(Integer id);

	public boolean updateData(Employee employee, Integer empId);

	public List<Employee> seeAllEmployees();
}
