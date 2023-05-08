package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.AdminModel;
import com.example.demo.Model.LoanApplicationModel;

import com.example.demo.Model.UserModel;
import com.example.demo.Repository.AdminModelRepo;
import com.example.demo.Repository.LoanApplicationRepo;

import com.example.demo.Repository.UserModelRepo;
@Service
public class EducationalLoanPortalService {
	//UserModel
    @Autowired
	UserModelRepo umrepo;
	
	public UserModel saveDetail(UserModel um)
	{
		return umrepo.save(um);
	}
	public List<UserModel> getDetail()
	{
		return umrepo.findAll();
	}
	public UserModel updateInfo(UserModel km)
	{
		return umrepo.saveAndFlush(km);
	}
	public void deleteInfo(int id)
	{
		umrepo.deleteById(id);
	}

	//LoanApplicationModel
	@Autowired
	LoanApplicationRepo larepo;
	public LoanApplicationModel saveInfo(LoanApplicationModel lam)
	{
		return larepo.save(lam);
	}
	public List<LoanApplicationModel> getInfo()
	{
		return larepo.findAll();
	}
	//AdminModel
	@Autowired
	AdminModelRepo amrepo;
	public AdminModel savedata(AdminModel adm)
	{
		return amrepo.save(adm);
	}
	public List<AdminModel> getdata()
	{
		return amrepo.findAll();
	}
	
	
}

	
