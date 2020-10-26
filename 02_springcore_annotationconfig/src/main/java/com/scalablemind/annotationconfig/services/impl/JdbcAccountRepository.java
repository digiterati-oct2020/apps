package com.scalablemind.annotationconfig.services.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.scalablemind.annotationconfig.services.AccountRepository;
import com.scalablemind.annotationconfig.services.DataSource;

//@Component
public class JdbcAccountRepository implements AccountRepository {
	
	//@Autowired
	public JdbcAccountRepository(DataSource dataSource) {
		super();
		System.out.println("inside jdbc account repository constructor...."+dataSource);
	}
	
	
	@Override
	public Integer getAccountId(String username) {
		return 10001;
	}

}
