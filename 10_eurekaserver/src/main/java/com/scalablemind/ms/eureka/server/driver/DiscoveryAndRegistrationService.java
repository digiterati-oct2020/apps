package com.scalablemind.ms.eureka.server.driver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class DiscoveryAndRegistrationService {
	

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryAndRegistrationService.class, args);
	}

}
