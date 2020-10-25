package com.scalablemind.aop.service.impl;

import org.springframework.stereotype.Component;

import com.scalablemind.aop.service.TestService;

@Component
public class TestServiceImpl implements TestService{
	
	
	public void display() {
		System.out.println("Inside display method");
	}

}
