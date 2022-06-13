package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Hello")
public class Helloworld {
	
	@GetMapping
	public String getHello() {
		return "HelloSecureWebTest";
	}

}
