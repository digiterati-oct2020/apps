package com.scalablemind.web.driver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(scanBasePackages = {"com.scalablemind.web.controller"})
public class WebDriver extends SpringBootServletInitializer {
	
	  public static void main(String[] args) { 
		  ConfigurableApplicationContext ctx = SpringApplication.run(WebDriver.class,args); 
	  }
	  
	  @Override protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {  
		  return builder.sources(WebDriver.class); 
	  }
	 

}
