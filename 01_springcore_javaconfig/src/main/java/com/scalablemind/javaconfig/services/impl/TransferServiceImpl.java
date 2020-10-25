package com.scalablemind.javaconfig.services.impl;

import com.scalablemind.javaconfig.services.DataSource;
import com.scalablemind.javaconfig.services.TransferService;

public class TransferServiceImpl implements TransferService {
	
	
	private DataSource dataSource;

	public TransferServiceImpl(DataSource dataSource) {
		super();
		System.out.println("inside transfer service impl constructor...."+dataSource);
		this.dataSource = dataSource;
	}
	
}
