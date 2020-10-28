package com.scalablemind.sleuth.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/services")
public class SleuthService2 {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SleuthService2.class);
	
	@RequestMapping("/service2")
	public String service() {
		LOGGER.info("=================================================================service2 call start");
		LOGGER.info("=================================================================service2 call end");
		return "response from service3";
	}

}
