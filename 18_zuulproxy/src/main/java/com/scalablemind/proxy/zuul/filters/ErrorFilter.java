package com.scalablemind.proxy.zuul.filters;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;


@Component
public class ErrorFilter extends ZuulFilter {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ErrorFilter.class);

	@Override
	public Object run() throws ZuulException {
		LOGGER.info("inside error filter ==========================================");
		return null;
	}

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public int filterOrder() {
		return 1;
	}

	@Override
	public String filterType() {
		return "error";
	}

}
