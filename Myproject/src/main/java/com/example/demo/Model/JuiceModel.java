package com.example.demo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="juicemodel")
public class JuiceModel {

	@Id
	@Column(name="sno")
	private int sno;
	private String jname;
	private int jprice; 
	private int jquantity;
	private int jrating;
	
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getJname() {
		return jname;
	}
	public void setJname(String jname) {
		this.jname = jname;
	}
	public int getJprice() {
		return jprice;
	}
	public void setJprice(int jprice) {
		this.jprice = jprice;
	}
	public int getJquantity() {
		return jquantity;
	}
	public void setJquantity(int jquantity) {
		this.jquantity = jquantity;
	}
	public int getJrating() {
		return jrating;
	}
	public void setJrating(int jrating) {
		this.jrating = jrating;
	}
	
	
}
