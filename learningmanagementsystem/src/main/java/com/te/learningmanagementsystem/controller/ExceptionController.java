package com.te.learningmanagementsystem.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.te.learningmanagementsystem.exception.EmployeeException;

@ControllerAdvice
public class ExceptionController {

	@ExceptionHandler(EmployeeException.class)
	public String excep(EmployeeException exception, HttpServletRequest request) {
		request.setAttribute("errMsg", exception.getMessage());
		return "loginForm";
	}
}
