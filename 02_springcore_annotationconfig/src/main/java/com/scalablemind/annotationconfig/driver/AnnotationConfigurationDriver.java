package com.scalablemind.annotationconfig.driver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.scalablemind.annoationconfig.config.AnnotationConfig;

@SpringBootApplication
@Import(AnnotationConfig.class)
public class AnnotationConfigurationDriver {
	
	public static void main(String[] args) {
		SpringApplication.run(AnnotationConfigurationDriver.class,args);
		//ctx.registerShutdownHook();
		//ctx.close();
	}

}
