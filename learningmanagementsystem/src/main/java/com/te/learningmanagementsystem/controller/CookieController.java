package com.te.learningmanagementsystem.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cookies")
public class CookieController {

	@GetMapping("/getCookie")
	public String getCookiePage() {
		return "cookie";
	}

	@GetMapping("/createcookie")
	public String createCookie(HttpServletResponse response, ModelMap map) {
		Cookie cookie = new Cookie("JFS", "SpringMVC");
		cookie.setMaxAge(60);
		response.addCookie(cookie);
		map.addAttribute("msg", "Cookie created successfully!!");
		return "cookie";
	}

	@GetMapping("/readcookie")
	public String readCookie(HttpServletRequest request, ModelMap map,
			@CookieValue(name = "JSESSIONID", required = false) String value) {
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			map.addAttribute("cookies", value);
		} else {
			map.addAttribute("msg", "No cookies found");
		}
		return "cookie";
	}
}
