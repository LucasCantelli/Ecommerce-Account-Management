package com.example.Ecommerceaccountmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EcommerceAccountManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceAccountManagementApplication.class, args);
	}

}
