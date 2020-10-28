package com.scalablemind.circuitbreaker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/services")
public class ServiceController2 {
	
	private int cntr = 0;
	
	@GetMapping(value="/Subject2",produces="application/text")
	public String getSubject(@RequestParam(name="subjectNumber") String subjectNumber) {
		cntr++;
		if(cntr<=2) {
			throw new RuntimeException("error");
		}
		return "response from service2";
	}
	
}
