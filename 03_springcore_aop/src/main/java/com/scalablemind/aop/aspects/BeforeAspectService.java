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
	
	@Before("execution(* display(*))")
	public void beforeChange(JoinPoint jp) {
		Integer inputVal = (Integer)jp.getArgs()[0];
		System.out.println("inside aspect - Before change...."+inputVal.toString());
	}
	
	
	@Around("execution(* display(*))")
	public void aroundAdvice(ProceedingJoinPoint pjp) {
		System.out.println("inside aspect - around advice...."+pjp.getSignature());
		
		if(true) {
			try {
				System.out.println(pjp.proceed());
			} catch(Throwable ex) {}
		}
		
	}
	


}
