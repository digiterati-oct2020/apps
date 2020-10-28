package com.scalablemind.zuul.app1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller1 {
	
	@GetMapping(value="/app1",produces = "application/text")
	public String getMessage() {
		return "message from app1";
	}

}
