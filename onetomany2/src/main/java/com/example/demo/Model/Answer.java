package com.example.demo.Model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="ans")
public class Answer {
	@Id
	private int ano;
	private String anwer;
	
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getAnwer() {
		return anwer;
	}
	public void setAnwer(String anwer) {
		this.anwer = anwer;
	}
	
	
	}
