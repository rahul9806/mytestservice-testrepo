package com.icici.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	
	@GetMapping(value="/greeting")
	public String displaymessage() {
		return "hello world this is my fisrt message";
	}
}
