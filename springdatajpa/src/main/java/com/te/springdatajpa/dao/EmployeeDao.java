package com.te.springdatajpa.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.te.springdatajpa.dto.Employee;

public interface EmployeeDao extends CrudRepository<Employee, Integer> {

	public Employee findByEmpId(Integer empId);

	public List<Employee> findByDept(String dept);

	public List<Employee> findAllByOrderByEmpNameDesc();

//	@Query("from Employee where empName like 'S%'")
	public List<Employee> getEmployeeByName();
	

}