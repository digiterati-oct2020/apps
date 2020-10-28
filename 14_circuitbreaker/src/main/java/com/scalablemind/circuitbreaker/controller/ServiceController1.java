package com.scalablemind.circuitbreaker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("/services")
public class ServiceController1 {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping(value="/Subject1",produces="application/text")
	@HystrixCommand(fallbackMethod = "backupMethod")
	public String getSubject(@RequestParam(name="subjectNumber") String subjectNumber) {
		return restTemplate.getForObject("http://localhost:8882/services/Subject2?subjectNumber="+subjectNumber, String.class);
	}
	
	
	private String backupMethod(String subjectNumber) {
		   return String.format("Sorry unable to process your request for subject number:%s. Kindly try again!!",subjectNumber);
		}
	
}
