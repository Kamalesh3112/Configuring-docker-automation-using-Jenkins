package com.jenkinsautomation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class IntegrationApplication {

	@GetMapping
	public String message(){
		return "welcome to my pipeline";
	}

	public static void main(String[] args) {
		SpringApplication.run(IntegrationApplication.class, args);
	}

}
