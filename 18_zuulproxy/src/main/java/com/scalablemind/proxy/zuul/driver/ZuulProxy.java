package com.scalablemind.proxy.zuul.driver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableZuulProxy
@ComponentScan("com.scalablemind.proxy.zuul.filters")
public class ZuulProxy {
	
	
	public static void main(String[] args) {
		SpringApplication.run(ZuulProxy.class, args);
	}

}
