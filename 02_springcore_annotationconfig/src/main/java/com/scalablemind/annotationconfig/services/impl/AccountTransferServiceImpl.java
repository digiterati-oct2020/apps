package com.scalablemind.annotationconfig.services.impl;

import org.springframework.stereotype.Component;

import com.scalablemind.annotationconfig.services.TransferService;

@Component("accountTransferService")
public class AccountTransferServiceImpl implements TransferService {

	@Override
	public void display() {
		System.out.println("Accounttrransfer----------->");
		
	}

}
