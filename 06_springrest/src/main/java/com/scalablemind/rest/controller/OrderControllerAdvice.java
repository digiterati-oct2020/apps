package com.scalablemind.rest.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class OrderControllerAdvice {

	@ExceptionHandler(RuntimeException.class)
	public OrderExceptionInfo handleOrderRuntimeException() {
		return new OrderExceptionInfo("handled exception");
	}
	
}
