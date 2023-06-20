package com.example.firstservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping(value = "/first-service/")
public class FirstserviceApplication {

	@GetMapping(value="/welcome")
	public String welcome(){
		return "Welcome to the First service";
	}

	public static void main(String[] args) {
		SpringApplication.run(FirstserviceApplication.class, args);
	}

}
