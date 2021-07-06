package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DockerDemoController {
	@GetMapping("/getMessage")
	public String studentMethod() {
		return ("I am demo controller method");
	}

}
