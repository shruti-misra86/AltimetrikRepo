package com.example.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.MathModel;

@RestController
public class DemoController {

	@RequestMapping("/")
	public String sayHello() {
		return "Hello 1st";
	}

	@RequestMapping("/Shruti")
	public String sayHi() {
		return "Hello 2nd";
	}

	@RequestMapping(value = "/multiply", method = RequestMethod.POST)
	public String multiply(@RequestBody MathModel mathModel) {

		int product = mathModel.getA() * mathModel.getB();
		return String.valueOf(product);

	}

}
