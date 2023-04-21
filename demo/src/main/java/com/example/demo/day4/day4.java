package com.example.demo.day4;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class day4 {
	
@Value("${carname}")

	public String car;
@GetMapping("Keerthi")
@ResponseBody
	public String displayCar()
	{
		return "My fav car is"+car;
	}
}
