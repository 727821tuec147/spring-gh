package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.CarModel;
import com.example.demo.Repository.CarRepo;



@Service
public class CarService {

	@Autowired
	public CarRepo carrepo;
	//posting the info
	public CarModel saveInfo (CarModel cm)
	{
		return carrepo.save(cm);
	}
    //getting the info
	public List<CarModel> getInfo()
	{
		return carrepo.findAll();
	}
	public CarModel updateInfo(CarModel cu)
	{
		return carrepo.saveAndFlush(cu);
	}
	public void deleteInfo(int id)
	{
		carrepo.deleteById(id);
	}
	
}
