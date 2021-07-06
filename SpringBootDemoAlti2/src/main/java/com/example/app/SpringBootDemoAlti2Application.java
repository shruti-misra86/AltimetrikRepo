package com.example.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example")
public class SpringBootDemoAlti2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoAlti2Application.class, args);
	}

}
