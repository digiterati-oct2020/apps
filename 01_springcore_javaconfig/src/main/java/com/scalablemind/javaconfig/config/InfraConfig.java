package com.scalablemind.javaconfig.config;

import org.springframework.context.annotation.Bean;

import com.scalablemind.javaconfig.services.DataSource;
import com.scalablemind.javaconfig.services.impl.BasicDataSource;

public class InfraConfig {
	
	
	@Bean
	public DataSource dataSource() {
		System.out.println("inside datasource ------------------------");
		BasicDataSource basicDataSource = new BasicDataSource();
		basicDataSource.setUrl("Test URL");
		basicDataSource.setPassword("Test Password");
		basicDataSource.setDriverClassName("Test Driver Class");
		basicDataSource.setUsername("Test Username");
		return basicDataSource;
	}

}
