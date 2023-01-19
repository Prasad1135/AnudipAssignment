package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Grocery;

public interface GroceriesRepository extends JpaRepository<Grocery,Integer>{
	
			//Custom method
			List<Grocery> findByid(int id);
			List<Grocery> findByname(String name);
}