package com.scalablemind.feignclient.contract;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="subject-client-service",url ="http://localhost:8882")
public interface SubjectFeignContract {
	   
	@RequestMapping("/services/Subject")
	public String findByInputId(@RequestParam(value="subjectNumber") String subjectNumber);
	   
}

