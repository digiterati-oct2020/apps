package com.scalablemind.test.service.impl;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.DirtiesContext.MethodMode;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.scalablemind.test.config.TestConfiguration;
import com.scalablemind.test.service.TestService;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = TestConfiguration.class)
@DirtiesContext(methodMode = MethodMode.BEFORE_METHOD)
public class TestServiceImplTest {
	
	@Autowired
	private TestService testService;
	
	
	@Test
	public void testFetchResult_basic_flow() {
		String result  = testService.fetchResult("is");
		int count = 4; 
		Assert.assertTrue(result.equals(count+""));
	}
	
	
	@Test
	public void testFetchResult_with_apple_as_input() {
		String result  = testService.fetchResult("apple");
		int count = 25; 
		Assert.assertTrue(result.equals(count+""));
	}
	
	
	
	@Test
	public void testFetchResult_with_proper_data() {
		/*
		 * String sampleInput = "is"; DataRepository repo = mock(DataRepository.class);
		 * when(repo.fetch(2)).thenReturn(4);
		 * 
		 * TestService service = new TestServiceImpl(repo); String result =
		 * service.fetchResult(sampleInput);
		 * 
		 * 
		 * int count = 4; Assert.assertTrue(result.equals(count+""));
		 */
	}

}
