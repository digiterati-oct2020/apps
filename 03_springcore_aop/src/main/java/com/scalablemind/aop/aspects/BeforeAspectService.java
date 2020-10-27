package com.scalablemind.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BeforeAspectService {
	
	@Before("execution(* display())")
	public void beforeChange(JoinPoint jp) {
		System.out.println("inside aspect - Before change...."+jp.getSignature());
	}
	
	
	@Around("execution(* display())")
	public void aroundAdvice(ProceedingJoinPoint pjp) {
		System.out.println("inside aspect - around advice...."+pjp.getSignature());
		
		if(true) {
			try {
				System.out.println(pjp.proceed());
			} catch(Throwable ex) {}
		}
		
	}
	


}
