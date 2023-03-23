package io.apicode.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	
	@GetMapping("/")
	public String home() {		
		String healthCheck = "Bank Service - Status ok";

		return healthCheck;
	}
	

}
