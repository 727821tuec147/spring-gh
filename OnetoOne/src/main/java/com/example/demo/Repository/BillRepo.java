package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Bill;

public interface BillRepo extends JpaRepository<Bill, Integer> {

}
