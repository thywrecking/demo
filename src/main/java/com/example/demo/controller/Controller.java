package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@RequestMapping("/test")
	public String test() {
		System.out.println("12313");
		System.out.println("werrrrrrr");
		System.out.println("helloWord");
		return "HelloWorld";
	}
}
