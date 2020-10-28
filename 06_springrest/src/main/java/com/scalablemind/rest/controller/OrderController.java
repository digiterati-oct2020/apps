package com.scalablemind.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.scalablemind.rest.model.OrderResponse;

@RestController
@RequestMapping("/v1")
public class OrderController {	
	
	
	  private ObjectMapper mapper = new ObjectMapper();
	  
	  //Accept
	  //Content-Type
	  
	  @GetMapping(value="/services/Order",produces= {"application/json","application/xml"}) 
	  public String getOrderStatus() { 
		  try { 
			  return mapper.writeValueAsString("success");
		  } catch(JsonProcessingException ex) { 
			  return "system error while processing";
		  } 
	  }
	  
	  @GetMapping(value="/services/OrderValue/{inputValue}/test/{inputMessage}",produces= {"application/json","application/xml"}) 
	  public OrderResponse getOrderStatus(@PathVariable("inputValue") String inputValue,@PathVariable("inputMessage") String inputMessage,@RequestParam("query") String query) { 
		  try { 
			  return new OrderResponse(mapper.writeValueAsString(String.format("success  -  %s, %s,%s",inputValue,inputMessage,query)));
		  } catch(JsonProcessingException ex) { 
			  return new OrderResponse("system error while processing");
		  } 
	  }
	  
	  @PostMapping(value="/services/Order",produces="application/json",consumes="application/json") 
	  public String updateOrder(@RequestBody String orderId) {
		  try { 
			  return mapper.writeValueAsString(String.format("order id %s success!",orderId)); 
		  }catch(JsonProcessingException ex) { 
			  return "system error while processing"; 
		  }
	  }
	 

}
