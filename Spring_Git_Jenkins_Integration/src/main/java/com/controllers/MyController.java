package com.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/datas")
	public String hello() {
		return "hello from spring";
	}
	
	@GetMapping("/welcome")
	public String welcome() {
		return "welcome from spring from Git";
	}
}
