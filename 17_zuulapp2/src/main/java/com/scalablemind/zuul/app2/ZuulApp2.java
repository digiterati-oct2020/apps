package com.scalablemind.zuul.app2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ZuulApp2 {
	
	@GetMapping(value="/app2",produces = "application/text")
	public String getMessage() {
		return "message from app2";
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(ZuulApp2.class, args);
	}

}
