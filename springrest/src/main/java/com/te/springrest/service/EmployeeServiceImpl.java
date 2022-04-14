package com.te.springrest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.springrest.bean.Employee;
import com.te.springrest.dao.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao dao;

	@Override
	public Employee authenticate(Integer id, String pwd) {
		if (id <= 0) {
			return null;
		}
		return dao.authenticate(id, pwd);
	}

	@Override
	public boolean addEmployee(Employee employee) {
		if (employee.getEmpId() <= 0) {
			return false;
		} else {
			return dao.addEmployee(employee);
		}
	}

	@Override
	public boolean deleteData(Integer id) {
		if (id <= 0) {
			return false;
		} else {
			return dao.deleteData(id);
		}
	}

	@Override
	public boolean updateData(Employee employee, Integer empId) {
		return dao.updateData(employee, empId);
	}

	@Override
	public List<Employee> seeAllEmployees() {
		return dao.seeAllEmployees();
	}
}
