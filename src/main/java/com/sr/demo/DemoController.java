package com.sr.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

	@PostMapping("/save")
	public String saveUser() {
		return "User Saved sucessfully";
	}
	
	
	@GetMapping("/get")
	public String getUser() {
		return "User get sucessfully";
	}
}
