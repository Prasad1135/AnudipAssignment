package com.example.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Model.Customer;


@Service
public interface CustomerServices{
	
	//Customize Method create,get data,delete,Update,FindByid
	Customer createCustomer(Customer customer);
	List<Customer> findAllCustomer();
	void deleteCustomer(int id);
	Customer updateCustomer(Customer customer);
	List<Customer>findByid(int id);
	
	
}
