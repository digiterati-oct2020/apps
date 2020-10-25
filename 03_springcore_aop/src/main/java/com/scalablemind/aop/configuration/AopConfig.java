package com.scalablemind.aop.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.scalablemind.aop.service.impl","com.scalablemind.aop.aspects"})
public class AopConfig {
	
	
	

}
