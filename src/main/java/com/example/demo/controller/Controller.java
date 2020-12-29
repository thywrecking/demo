package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@RequestMapping("/test")
	public String test() {
		System.out.println("shishishisi");
		System.out.println("nihao");
		System.out.println("1234S");
		return "HelloWorld";		
	}
}
