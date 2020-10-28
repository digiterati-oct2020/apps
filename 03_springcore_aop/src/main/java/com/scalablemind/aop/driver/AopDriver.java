package com.scalablemind.aop.driver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;

import com.scalablemind.aop.configuration.AopConfig;
import com.scalablemind.aop.service.TestService;

@SpringBootApplication
@Import(AopConfig.class)
public class AopDriver {
	
	public static void main(String[] args) {
		ApplicationContext c = SpringApplication.run(AopDriver.class,args);
		
		TestService service = c.getBean(TestService.class);
		System.out.println("driver - before invoking display method");
		service.display(888);
	}

}
