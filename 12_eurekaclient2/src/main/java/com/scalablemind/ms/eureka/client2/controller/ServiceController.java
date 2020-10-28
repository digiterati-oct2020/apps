package com.scalablemind.ms.eureka.client2.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/services")
public class ServiceController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ServiceController.class);

	@GetMapping(value="/Subject2",produces="application/text")
	public String getSubject(@RequestParam(name="subjectNumber") String subjectNumber) {
		LOGGER.info("=================================================================service call start");
		return restTemplate.getForObject("http://subject-client-service/services/Subject?subjectNumber="+subjectNumber, String.class);
	}
	
}
