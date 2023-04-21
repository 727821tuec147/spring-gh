package com.example.demo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="model")
public class Model {

	@Id
	@Column(name="mid")
	private int mid;
	private String mname;
	private int mage;
	private int msalary;
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public int getMage() {
		return mage;
	}
	public void setMage(int mage) {
		this.mage = mage;
	}
	public int getMsalary() {
		return msalary;
	}
	public void setMsalary(int msalary) {
		this.msalary = msalary;
	}
	
	
	
}
