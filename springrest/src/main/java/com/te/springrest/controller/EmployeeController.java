package com.te.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.te.springrest.bean.Employee;
import com.te.springrest.bean.EmployeeResponse;
import com.te.springrest.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService service;
	
	@Autowired
	private EmployeeResponse response;

	@GetMapping(path = "/getAllEmp", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public EmployeeResponse getAllEmp() {
		List<Employee> employees = service.seeAllEmployees();
		if (employees != null) {
			response.setStatusCode(200);
			response.setMsg("Success");
			response.setDescription("Data found");
			response.setEmployees(employees);
		} else {
			response.setStatusCode(404);
			response.setMsg("Failure");
			response.setDescription("No data found");
		}
		return response;
	}

	@DeleteMapping("/delete/{empId}")
	public EmployeeResponse deleteData(@PathVariable Integer empId) {
		if (service.deleteData(empId)) {
			response.setStatusCode(200);
			response.setMsg("Success");
			response.setDescription("Data deleted for id:" + empId);
		} else {
			response.setStatusCode(404);
			response.setMsg("Failure");
			response.setDescription("Data not found for id:" + empId);
		}
		return response;
	}

	@PostMapping("/add")
	public boolean addEmployee(@RequestBody Employee employee) {
		return service.addEmployee(employee);
	}
}
