package com.example.electronicwallet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ElectronicwalletApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElectronicwalletApplication.class, args);
	}

}
