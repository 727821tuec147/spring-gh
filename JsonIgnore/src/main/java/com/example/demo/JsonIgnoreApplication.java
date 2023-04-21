package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.io.JsonEOFException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class JsonIgnoreApplication {

	public static void main(String[] args)  throws JsonProcessingException {
		SpringApplication.run(JsonIgnoreApplication.class, args);
		Day5 d=new Day5(1,"Raji",12);
		ObjectMapper m=new ObjectMapper();
		String json=m.writeValueAsString(d);
		System.out.println(json);
				
	}

}
