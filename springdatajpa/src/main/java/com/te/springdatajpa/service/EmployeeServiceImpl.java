package com.te.springdatajpa.service;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.springdatajpa.dao.EmployeeDao;
import com.te.springdatajpa.dto.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao dao;

	@Autowired
	private EntityManager manager;

	@Override
	public Employee addEmployee(Employee employee) {
		return dao.save(employee);
	}

	@Override
	public Employee getEmployee(Integer empId) {
		return dao.findByEmpId(empId);
	}

	@Override
	public List<Employee> getByDept(String dept) {
		return dao.findByDept(dept);
	}

	@Override
	public List<Employee> orderByEmpName() {
		return dao.findAllByOrderByEmpNameDesc();
	}

	@Override
	public List<Employee> getEmpName() {
		manager.createNamedQuery("Employee.getEmployeeByName");
		return dao.getEmployeeByName();
	}
}
