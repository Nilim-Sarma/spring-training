package com.te.learningmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.learningmanagementsystem.dao.EmployeeDao;
import com.te.learningmanagementsystem.dto.Employee;
import com.te.learningmanagementsystem.exception.EmployeeException;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao dao;

	@Override
	public Employee authenticate(Integer id, String pwd) {
		if (id <= 0) {
			throw new EmployeeException("Please enter id greater than 1");
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
