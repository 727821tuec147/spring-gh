package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.LoginModel;
import com.example.demo.Repository.LoginModelRepo;
@Service
public class LoginService {
@Autowired
LoginModelRepo lmrepo;
public LoginModel saveLogin(LoginModel lm)
{
	return lmrepo.save(lm);
}

public String validateUser(String email,String password)
{
	String result="";
	LoginModel lm=lmrepo.findByEmail(email);
	if(lm==null)
	{
		result= "no user found";
	}
	else
	{
		if(lm.getPassword().equals(password))
			
		{
			result= "Login successfull";
		}
		else
		{
			result="login failed";
		}
		

     }
	return result;
}
}