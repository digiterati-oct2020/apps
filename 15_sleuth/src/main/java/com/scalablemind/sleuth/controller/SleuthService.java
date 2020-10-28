package com.scalablemind.sleuth.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/services")
public class SleuthService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SleuthService.class);
	
	@RequestMapping("/service")
	public String service() {
		String url = "http://localhost:8883/services/service1";
		LOGGER.info("=================================================================service call start");
		String response = new RestTemplate().exchange(url, HttpMethod.GET,null,String.class).getBody();
		LOGGER.info("=================================================================service call end");
		return response;
	}

}
