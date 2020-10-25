package com.scalablemind.javaconfig.services.impl;

import com.scalablemind.javaconfig.services.AccountRepository;
import com.scalablemind.javaconfig.services.DataSource;

public class JdbcAccountRepository implements AccountRepository {
	
	private DataSource dataSource;

	//@Autowired
	public JdbcAccountRepository(DataSource dataSource) {
		super();
		System.out.println("inside jdbc account repository constructor...."+dataSource);
		this.dataSource = dataSource;
	}
	
	
	@Override
	public Integer getAccountId(String username) {
		return 10001;
	}

}
