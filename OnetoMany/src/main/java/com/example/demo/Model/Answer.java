 package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="ano")
public class Answer {
	@Id
private int ano;
private String ans;
public int getAno() {
	return ano;
}
public void setAno(int ano) {
	this.ano = ano;
}
public String getAns() {
	return ans;
}
public void setAns(String ans) {
	this.ans = ans;
}

}
