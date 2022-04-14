package com.te.springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.te.springmvc.bean.Employee;

@Controller
public class SpringMvcController {

	@RequestMapping("/login")
	public String loginPage() {
		return "loginform";
	}

//	Getting form data 1st way
//	@PostMapping("/login1")
//	public String firstWayOfGettingFormData(HttpServletRequest request
//			, Model model) {
//
//		String user = request.getParameter("user");
//		String pass = request.getParameter("pass");
//
//		model.addAttribute("n", name);
//		model.addAttribute("p", pwd);
//		return "profile";
//	}

//	Getting form data 2nd way
//	@PostMapping("/login1")
//	public String secondWayOfGettingFormData(ModelMap map,
//			@RequestParam(name = "user") String name, 
//			@RequestParam(name = "pass") String pwd) {
//		
//		map.addAttribute("name", name);
//		map.addAttribute("pass", pwd);
//		return "profile";
//	}

//	Getting form data 3rd way
//	@PostMapping("/login1")
//	public String thirdWayOfGettingFormData(ModelMap map, String user, String pass) {
//		map.addAttribute("name", user);
//		map.addAttribute("pass", pass);
//		return "profile";
//	}

//	Getting form data 4th way
	@PostMapping("/login1")
	public String fourthWayOfGettingFormData(ModelMap map, Employee employee) {
		map.addAttribute("data", employee);
		return "profile";
	}

}
