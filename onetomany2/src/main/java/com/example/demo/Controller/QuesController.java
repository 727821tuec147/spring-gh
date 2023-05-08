package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Question;
import com.example.demo.Repository.QuestionRepo;
@RestController
@RequestMapping("/question")
public class QuesController {

	  @Autowired
	  QuestionRepo qrepo;
	  @PostMapping("")
	  public String saveDetails(@RequestBody Question q)
	  {
		  qrepo.save(q);
		  return "Data is saved";
	  }
	  @DeleteMapping("/delete")
	  public String deleteDetails(@RequestBody Question lm)
	  {
		  qrepo.delete(lm);
		  return "Data is deleted";
	  }
	  public String deleteString(@PathVariable int id)
	  {
		  qrepo.deleteById(id);
		  return "bye";
	  }
}
