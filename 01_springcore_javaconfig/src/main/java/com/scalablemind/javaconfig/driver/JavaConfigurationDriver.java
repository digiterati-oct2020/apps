package com.scalablemind.javaconfig.driver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;

import com.scalablemind.javaconfig.config.JavaConfigurationConfig;
import com.scalablemind.javaconfig.services.AccountRepository;
import com.scalablemind.javaconfig.services.TransferService;
import com.scalablemind.javaconfig.services.impl.BasicDataSource;
import com.scalablemind.javaconfig.services.impl.TransferServiceImpl;

@SpringBootApplication
@Import(JavaConfigurationConfig.class)
public class JavaConfigurationDriver {
	
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(JavaConfigurationDriver.class,args);
		
		
		TransferService service = ctx.getBean(TransferService.class);
		TransferService service1 = (TransferService)ctx.getBean("transferService");
		
		
		TransferService service2 = new TransferServiceImpl(new BasicDataSource());
		
		System.out.println(service==service1);
		System.out.println(service==service2);
		
		AccountRepository repo = ctx.getBean(AccountRepository.class);
		AccountRepository repo1 = (AccountRepository)ctx.getBean("accountRepository");
		
		System.out.println(repo==repo1);
	}

}
