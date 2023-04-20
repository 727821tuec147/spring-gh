package com.example.demo.day1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class day1 {
	
	@GetMapping("/hi")
	@ResponseBody
	public String hi() {
		return"Welcome";
	}
}
