package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RestApiController {
	@GetMapping("/rest")
	public String getRestApi() {
		return "rest";
	}

	
}
