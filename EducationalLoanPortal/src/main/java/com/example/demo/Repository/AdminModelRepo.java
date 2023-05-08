package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.AdminModel;

public interface AdminModelRepo extends JpaRepository<AdminModel, Integer> {

}
