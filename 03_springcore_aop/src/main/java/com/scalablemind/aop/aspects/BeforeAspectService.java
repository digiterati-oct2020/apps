package com.scalablemind.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BeforeAspectService {
	
	@Before("execution(* display())")
	public void beforeChange() {
		System.out.println("Before change....");
	}
	


}
