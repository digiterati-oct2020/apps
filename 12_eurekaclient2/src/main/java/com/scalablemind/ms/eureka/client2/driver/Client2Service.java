package com.scalablemind.ms.eureka.client2.driver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.scalablemind.ms.eureka.client2.configuration.Client2Configuration;

@SpringBootApplication
@Import(Client2Configuration.class)
public class Client2Service {

	public static void main(String[] args) {
		SpringApplication.run(Client2Service.class, args);
	}
	
}
