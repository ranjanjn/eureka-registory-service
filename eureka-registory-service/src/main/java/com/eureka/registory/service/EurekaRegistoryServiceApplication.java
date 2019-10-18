package com.eureka.registory.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaRegistoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaRegistoryServiceApplication.class, args);
	}

}
