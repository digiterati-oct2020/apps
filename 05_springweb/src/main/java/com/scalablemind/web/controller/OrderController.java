package com.scalablemind.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class OrderController {
	
	@PostMapping(value="/services/submit")
	public String submitLogin(@ModelAttribute("orderInfo") OrderInfo orderInfo,Model model) {
		String result = "";
		
		if(orderInfo.getUsername().equals("test") && orderInfo.getPassword().equals("test")) {
			result = "success";
		} else {
			result = "error";
		}
		model.addAttribute("message", result);
		model.addAttribute("test", "test1");
		return "response";
	}
	
	
	@GetMapping(value="/services/login")
	public String login(Model model) {
		model.addAttribute("orderInfo", new OrderInfo());
		return "login";
	}
}
