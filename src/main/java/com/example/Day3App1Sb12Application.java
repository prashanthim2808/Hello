package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@SpringBootApplication
public class Day3App1Sb12Application {

	public static void main(String[] args) {
		SpringApplication.run(Day3App1Sb12Application.class, args);
	}
	@GetMapping("/hello")
	public String getMethodName(@RequestParam String param) {
		return new String();
	}
	
}
