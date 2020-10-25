package com.scalablemind.test.service.impl;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import com.scalablemind.test.service.TestService;

@RunWith(SpringRunner.class)
public class TestServiceImplTest {
	
	@Test
	public void testFetchResult_with_proper_data() {
		String sampleInput = "apple";
		DataRepository repo = mock(DataRepository.class);
		int count = sampleInput.length() * sampleInput.length();
		when(repo.fetch(sampleInput.length())).thenReturn(count);
		TestService service = new TestServiceImpl(repo);
		String result = service.fetchResult(sampleInput);
		Assert.assertTrue(result.equals(count+""));
	}

}
