package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@GetMapping("/getEmployeeMessage")
	public String employeeMethod() {
		return ("I am employee controller method");
	}

}
