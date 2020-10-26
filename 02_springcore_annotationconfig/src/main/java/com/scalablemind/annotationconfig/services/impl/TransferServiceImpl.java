package com.scalablemind.annotationconfig.services.impl;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.scalablemind.annotationconfig.services.DataSource;
import com.scalablemind.annotationconfig.services.TransferService;

@Component("transferService")
public class TransferServiceImpl implements TransferService {
	
	private DataSource dataSource;

	public TransferServiceImpl() {
		super();
		System.out.println("inside transfer service impl constructor...."+dataSource);
	}
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		System.out.println("setter injection"+dataSource);
		this.dataSource = dataSource;
	}
	
	
	@PostConstruct
	public void init() {
		System.out.println("inside transfer service init...."+dataSource);
	}
	
	
	public void display() {
		System.out.println(dataSource.toString());
	}
	
}
