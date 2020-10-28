package com.scalablemind.circuitbreaker.driver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableHystrix
@ComponentScan("com.scalablemind.circuitbreaker.controller")
public class BreakerDriver {
	
	public static void main(String[] args) {
	      SpringApplication.run(BreakerDriver.class, args);
	   }
	
	@Bean
	public RestTemplate createRestTemplate() {
		return new RestTemplate();
	}
	

}
