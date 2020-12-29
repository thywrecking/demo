package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@RequestMapping("/test")
	public String test() {
		System.out.println("helloWord");
		return "HelloWorld";
	}
}
