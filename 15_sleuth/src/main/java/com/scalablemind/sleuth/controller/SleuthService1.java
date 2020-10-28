package com.scalablemind.sleuth.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/services")
public class SleuthService1 {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SleuthService1.class);
	
	@RequestMapping("/service1")
	public String service() {
		String url = "http://localhost:8883/services/service2";
		LOGGER.info("=================================================================service1 call start");
		String response = new RestTemplate().exchange(url, HttpMethod.GET,null,String.class).getBody();
		LOGGER.info("=================================================================service1 call end");
		return response;
	}

}
