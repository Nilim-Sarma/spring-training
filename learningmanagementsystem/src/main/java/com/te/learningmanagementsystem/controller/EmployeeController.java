package com.te.learningmanagementsystem.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.te.learningmanagementsystem.dto.Employee;
import com.te.learningmanagementsystem.service.EmployeeService;

@Controller
@RequestMapping("/lms")
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@GetMapping("/login")
	public String login() {
		return "loginForm";
	}

	@PostMapping("/login")
	public String authenticate(Integer empId, String empPassword, ModelMap map, HttpServletRequest request) {
		Employee employee = service.authenticate(empId, empPassword);
		HttpSession session = request.getSession();
		session.setAttribute("loggedIn", employee);
//		session.setMaxInactiveInterval(5);
		if (employee != null) {
			map.addAttribute("data", employee.getEmpName());
			return "homePage";

		} else {
			map.addAttribute("errMsg", "Invalid credentials");
			return "loginForm";
		}
	}

	@GetMapping("/addForm")
	public String addForm(@SessionAttribute(name = "loggedIn", required = false) Employee employee, ModelMap map) {
		if (employee != null) {

			return "addForm";
		} else {
			map.addAttribute("errMsg", "Please login first!!");
			return "loginForm";
		}
	}

	@PostMapping("/add")
	public String addEmployee(ModelMap map, Employee employee,
			@SessionAttribute(name = "loggedIn", required = false) Employee employee2) {
		if (employee2 != null) {
			if (service.addEmployee(employee)) {
				map.addAttribute("msg", "Data Added Successfully!!");
			} else {
				map.addAttribute("errMsg", "Something went wrong!!");
			}
			return "addForm";
		} else {
			map.addAttribute("errMsg", "Please login first!");
			return "loginForm";
		}
	}

	@GetMapping("/logout")
	public String logout(ModelMap map, HttpSession session) {
		map.addAttribute("errMsg", "Logged out successfully!!");
		session.invalidate();
		return "loginForm";
	}

	@GetMapping("/deleteForm")
	public String deleteForm() {
		return "deleteForm";
	}

	@PostMapping("/delete")
	public String deleteData(ModelMap map, Integer empId) {
		if (service.deleteData(empId)) {
			map.addAttribute("msg", "Data deleted successfully!!");
		} else {
			map.addAttribute("errMsg", empId + " not found!!");
		}
		return "deleteForm";
	}

	@GetMapping("/updateForm")
	public String updateForm(@SessionAttribute(name = "loggedIn", required = false) Employee employee, ModelMap map) {
		if (employee != null) {
			map.addAttribute("data", employee);
			return "update";
		} else {
			map.addAttribute("errMsg", "Please login first");
			return "loginForm";
		}
	}

	@PostMapping("/update")
	public String updateData(@SessionAttribute(name = "loggedIn", required = false) Employee employee,
			Employee employee2, ModelMap map) {
		if (employee != null) {
			if (service.updateData(employee2, employee.getEmpId())) {
				map.addAttribute("msg", "Data updated successfully!!");
				map.addAttribute("data", employee);
			} else {
				map.addAttribute("errMsg", "Something went wrong!");
			}
			return "update";
		} else {
			map.addAttribute("errMsg", "Please login first");
			return "loginForm";
		}
	}

	@GetMapping("/seeAll")
	public String seeAllEmployee(@SessionAttribute(name = "loggedIn", required = false) Employee employee,
			ModelMap map) {
		if (employee != null) {
			List<Employee> employees = service.seeAllEmployees();
			if (employees != null) {
				map.addAttribute("infos", employees);
				return "seeAll";
			} else {
				map.addAttribute("msg", "No records found");
				return "homePage";
			}
		} else {
			map.addAttribute("errMsg", "Please login first!");
			return "loginForm";
		}

	}

}
