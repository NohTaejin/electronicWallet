package com.example.secondservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping(value = "/second-service/")
public class SecondserviceApplication {
	@GetMapping("/welcome")
	public String welcome(){
		return "Welcome to the second service";
	}
	public static void main(String[] args) {
		SpringApplication.run(SecondserviceApplication.class, args);
	}

}
