package com.scalablemind.test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.scalablemind.test.service.TestService;

public class TestServiceImpl implements TestService {
	
	
	private DataRepository dataRepository;
	
	@Autowired
	public TestServiceImpl(DataRepository dataRepository) {
		this.dataRepository = dataRepository;
	}
	
	public String fetchResult(String strInput) {
		return dataRepository.fetch(strInput.length())+"";
	}

}
