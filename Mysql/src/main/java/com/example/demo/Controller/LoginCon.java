package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.LoginModel;
import com.example.demo.Service.LoginServ;

@RestController
public class LoginCon {

	@Autowired
	LoginServ ls;
	@PostMapping("/checklogin")
	public  String validateUser(@RequestBody LoginModel l)
	{
		System.out.println(l.getUsername());
		return  ls.validateLogin(l.getUsername(),l.getPassword());
	}
	@PostMapping("/addUser")
    public LoginModel saveLoginModel(@RequestBody LoginModel lk)
    {
		return ls.saveLogin(lk);
    }
}
