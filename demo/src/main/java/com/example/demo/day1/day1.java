package com.example.demo.day1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class day1 {
	
	@GetMapping("/hi")
	public String hi() {
		return"Welcome";
	}
}
