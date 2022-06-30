package com.learn.deployment.deployment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@GetMapping("/")
	 public String home() {
		 return "homepage";
	 }
	@GetMapping("/about")
	public String about() {
		return "about pagee";
	}

}
