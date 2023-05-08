package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.LoginModel;
import com.example.demo.Repository.LoginRepo;
@Service
public class LoginServ {
	@Autowired
	LoginRepo lrepo;
	
	public LoginModel saveLogin(LoginModel lm)
	{
		return lrepo.save(lm);
	}
	public String validateLogin(String username,String password)
	{
		String result="";
		LoginModel lm=lrepo.findByUsername(username);
		if(lm==null)
		{
			result="Invalid user";
		}
		else
		{
			if(lm.getPassword().equals(password))
			{
				result="Login success";
			}
			else
			{
				result="Login failed";
			}
		}
		return result;
	}
	
}
