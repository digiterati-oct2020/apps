package com.scalablemind.javaconfig.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.scalablemind.javaconfig.services.AccountRepository;
import com.scalablemind.javaconfig.services.DataSource;
import com.scalablemind.javaconfig.services.TransferService;
import com.scalablemind.javaconfig.services.impl.BasicDataSource;
import com.scalablemind.javaconfig.services.impl.JdbcAccountRepository;
import com.scalablemind.javaconfig.services.impl.TransferServiceImpl;

@Configuration
@Import(InfraConfig.class)
public class JavaConfigurationConfig  {
	
	@Bean(name="transferService")
	public TransferService transferBean() {
		return new TransferServiceImpl(dataSource());
	}
	
	@Bean
	public AccountRepository accountRepository() {
		return new JdbcAccountRepository(dataSource());
	}
	
	
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


