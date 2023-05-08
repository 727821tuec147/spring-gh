package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Customer;
import com.example.demo.Repository.CustomerRepo;
@RestController
public class CustomerC {

	@Autowired
	CustomerRepo crepo;
	@PostMapping("/list")
	public String saveDetails(@RequestBody Customer c)
	{
		crepo.save(c);
		return"data is saved";
	}
	@GetMapping("/get")
	public List<Customer> fletchAll()
	{
		return crepo.findAll();
	}
}
