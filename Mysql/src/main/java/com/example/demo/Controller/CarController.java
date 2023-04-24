package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.CarModel;
import com.example.demo.Service.CarService;
@RestController
public class CarController {

	@Autowired
	public CarService cser;
	@PostMapping("/saveCar")
	public CarModel addDetails(@RequestBody CarModel ca)
	{
      return cser.saveInfo(ca);
	}
	@GetMapping("/getCar")
	public List<CarModel> getDetails()
	{
		return cser.getInfo();
	}
	@PutMapping("/updateCar")
	public CarModel updateDetails(@RequestBody CarModel cb)
	{
		return cser.updateInfo(cb);
	}
	@DeleteMapping("/deleteCar/{cid}")
	public String deleteDetails(@PathVariable int cid)
	{
		cser.deleteInfo(cid);
		return "Carid"+cid+"deleted";
	}
	
}
