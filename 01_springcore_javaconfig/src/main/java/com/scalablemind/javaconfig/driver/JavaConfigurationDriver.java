package com.scalablemind.javaconfig.driver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.scalablemind.javaconfig.config.JavaConfigurationConfig;

@SpringBootApplication
@Import(JavaConfigurationConfig.class)
public class JavaConfigurationDriver {
	
	public static void main(String[] args) {
		SpringApplication.run(JavaConfigurationDriver.class,args);
		//ctx.registerShutdownHook();
		//ctx.close();
	}

}
