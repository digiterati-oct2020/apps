package com.scalablemind.ms.eureka.client.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/services")
public class ServiceController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ServiceController.class);

	@GetMapping(value="/Subject",produces="application/text")
	public String getSubject(@RequestParam(name="subjectNumber") String subjectNumber) {
		LOGGER.info("=================================================================service call start");
		return String.format("subject number %s exists", subjectNumber);
	}
	
}
