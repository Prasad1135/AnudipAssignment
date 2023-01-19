package com.example.demo.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Model.Grocery;

@Service
public interface GroceryServices1 {
	Grocery createGroceries(Grocery groceries);
	List<Grocery> findAllGroceries();
	void deleteGroceries(int id);
	Grocery updateGroceries(Grocery groceries);
	List<Grocery> findByid(int id);
	List<Grocery> findByname(String name);
}
