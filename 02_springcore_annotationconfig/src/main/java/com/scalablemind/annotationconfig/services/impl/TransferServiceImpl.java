package com.scalablemind.annotationconfig.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.scalablemind.annotationconfig.services.DataSource;
import com.scalablemind.annotationconfig.services.TransferService;

@Component
public class TransferServiceImpl implements TransferService {
	
	@Autowired
	private DataSource dataSource;

	public TransferServiceImpl(DataSource dataSource) {
		super();
		System.out.println("inside transfer service impl constructor...."+dataSource);
		this.dataSource = dataSource;
	}
	
}
