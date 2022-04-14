package com.te.springdatajpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.te.springdatajpa.dto.Employee;
import com.te.springdatajpa.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService service;

	@PostMapping("/add")
	public ResponseEntity<?> addEmployee(@RequestBody Employee employee) {
		Employee employee2 = service.addEmployee(employee);
		if (employee2 != null) {
			return new ResponseEntity<String>("Data saved!!", HttpStatus.OK);
		} else {
			return new ResponseEntity<String>("Something went wrong", HttpStatus.BAD_REQUEST);
		}
	}

	@GetMapping("/getById/{empId}")
	public ResponseEntity<?> getEmployee(@PathVariable Integer empId) {
		Employee employee = service.getEmployee(empId);
		if (employee != null) {
			return new ResponseEntity<Employee>(employee, HttpStatus.OK);
		} else {
			return new ResponseEntity<String>("Data not found", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/getByDept/{dept}")
	public ResponseEntity<?> getEmployee(@PathVariable String dept) {
		List<Employee> employee = service.getByDept(dept);
		if (employee != null) {
			return new ResponseEntity<List<Employee>>(employee, HttpStatus.OK);
		} else {
			return new ResponseEntity<String>("Data not found", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/orderByName")
	public ResponseEntity<?> orderByName() {
		List<Employee> employee = service.orderByEmpName();
		if (employee != null) {
			return new ResponseEntity<List<Employee>>(employee, HttpStatus.OK);
		} else {
			return new ResponseEntity<String>("Data not found", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/getByName")
	public ResponseEntity<?> getByName() {
		List<Employee> employees = service.getEmpName();
		if(employees!=null) {
			return new ResponseEntity<List<Employee>>(employees, HttpStatus.OK);
		}else {
			return new ResponseEntity<String>("No data found", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
