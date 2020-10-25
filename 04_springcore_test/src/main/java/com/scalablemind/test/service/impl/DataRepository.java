package com.scalablemind.test.service.impl;

import org.springframework.stereotype.Repository;

@Repository
public class DataRepository {
	
	
	public int fetch(int number) {
		return number * number;
	}

}
