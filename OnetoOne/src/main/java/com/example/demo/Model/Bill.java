package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="bill")
public class Bill {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int billId;
public int getBillId() {
	return billId;
}
public void setBillId(int billId) {
	this.billId = billId;
}
public int getTotal() {
	return total;
}
public void setTotal(int total) {
	this.total = total;
}
private int total;
}
