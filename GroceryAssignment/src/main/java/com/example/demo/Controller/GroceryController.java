package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Grocery;
import com.example.demo.Services.GroceryServices1;



@RestController
public class GroceryController{
	@Autowired
	 GroceryServices1 groceryService;

	@PostMapping("/grocery")
	public Grocery createGrocery(@RequestBody Grocery grocery) {
	
		return groceryService.createGroceries(grocery);
	}

	@GetMapping("/grocery")
	public List<Grocery> findAllGrocery() {
		return groceryService.findAllGroceries();
	}

	@DeleteMapping("/grocery/{id}")
	public String deleteGrocery(@PathVariable int id) {
		groceryService.deleteGroceries(id);
		return "Grocery is deleted";

	}

	@PutMapping("/grocery")
	public Grocery updateGrocery(@RequestBody Grocery Grocery) {
		return groceryService.updateGroceries(Grocery);
	}
	@GetMapping("/grocery/name/{name}")
	public List<Grocery> findByname(@PathVariable String name)
	{
		return groceryService.findByname(name);
	}
	@GetMapping("/grocery/id/{id}")
	public List<Grocery> findByid(@PathVariable int id)
	{
		return groceryService.findByid(id);
	}
}
