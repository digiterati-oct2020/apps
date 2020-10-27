package com.scalablemind.test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.scalablemind.test.service.TestService;

@Component
public class TestServiceImpl implements TestService {
	
	
	private DataRepository dataRepository;
	
	
	private String result = null;
	
	@Autowired
	public TestServiceImpl(DataRepository dataRepository) {
		this.dataRepository = dataRepository;
	}
	
	public String fetchResult(String strInput) {
		if(result!=null) {
			result = "success";
			return dataRepository.fetch(strInput.length())+"";
		}else {
			throw new RuntimeException("invalid data");
		}
		
	}

}
