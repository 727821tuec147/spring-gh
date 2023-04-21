package com.example.demo.day2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class day2 {
	
	public String name="Raja Sri";
	@GetMapping("/hello")
	public String hi() {
		return"welcome"+name;
	}

}
