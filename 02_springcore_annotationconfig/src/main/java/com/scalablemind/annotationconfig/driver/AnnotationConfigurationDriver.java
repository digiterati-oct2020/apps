package com.scalablemind.annotationconfig.driver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;

import com.scalablemind.annoationconfig.config.AnnotationConfig;
import com.scalablemind.annotationconfig.services.TransferService;

@SpringBootApplication
@Import(AnnotationConfig.class)
public class AnnotationConfigurationDriver {
	
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(AnnotationConfigurationDriver.class,args);
		
		TransferService s = ctx.getBean("transferService",TransferService.class);
		s.display();
		
		
		s = ctx.getBean("transferService",TransferService.class);
		s.display();
	}

}
