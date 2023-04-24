package com.example.demo.day3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class day3 {
	@Value("${carname}")
	public String car;
	@GetMapping("/hello")
	@ResponseBody
public String hi() {
	return"My fav car is"+car;
}
}
