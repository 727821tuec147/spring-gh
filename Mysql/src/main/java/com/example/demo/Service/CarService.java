package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
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
	//put or update
	public CarModel updateInfo(CarModel cu)
	{
		return carrepo.saveAndFlush(cu);
	}
	//delete
	public void deleteInfo(int id)
	{
		carrepo.deleteById(id);
	}
	//Sort
	public List<CarModel> sortDesc( String cname)
	{
		return carrepo.findAll(Sort.by(cname).descending());
	}
	//Pagination
	public List<CarModel> paginationData(int cnu,int csize)
	{
		Page<CarModel>p=carrepo.findAll(PageRequest.of(cnu,csize));
		return p.getContent();
	}
	public List<CarModel> paginationAndSorting(int cnu,int csize, String cname)
	{
		Page<CarModel>p=carrepo.findAll(PageRequest.of(cnu,csize,Sort.by(cname).descending()));
		return p.getContent();
	}
   
}