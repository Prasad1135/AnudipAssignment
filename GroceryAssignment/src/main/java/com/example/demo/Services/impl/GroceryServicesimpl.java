package com.example.demo.Services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Grocery;
import com.example.demo.Repository.GroceriesRepository;
import com.example.demo.Services.GroceryServices1;
@Repository
//implement Service
public class GroceryServicesimpl implements GroceryServices1 {
	@Autowired
//Create Repository Object
	GroceriesRepository groceryRepository;
	@Override
	
	public Grocery createGroceries(Grocery groceries) {
		// TODO Auto-generated method stub
		return groceryRepository.save( groceries);
	}

	@Override
	public List<Grocery> findAllGroceries() {
		// TODO Auto-generated method stub
		return groceryRepository.findAll();
	}

	@Override
	public void deleteGroceries(int id) {
		// TODO Auto-generated method stub
		groceryRepository.deleteById(id);
	}

	@Override
	public Grocery updateGroceries(Grocery groceries) {
		// TODO Auto-generated method stub
		Grocery _groceries=groceryRepository.findById(groceries.getId()).get();
		_groceries.setName(groceries.getName());
		_groceries.setPrice(groceries.getPrice());
		_groceries.setQuantity(groceries.getQuantity());
		return groceryRepository.save(_groceries) ;
	}

	@Override
	public List<Grocery> findByid(int id) {
		// TODO Auto-generated method stub
		return groceryRepository.findByid(id);
	}

	@Override
	public List<Grocery> findByname(String name) {
		// TODO Auto-generated method stub
		return groceryRepository.findByname(name);
	}

}
