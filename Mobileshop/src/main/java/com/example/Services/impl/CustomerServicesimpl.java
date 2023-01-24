package com.example.Services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.Model.Customer;
import com.example.Repository.CustomerRepository;
import com.example.Services.CustomerServices;
@Repository
public class CustomerServicesimpl implements CustomerServices{
@Autowired
CustomerRepository customerRepository;
	@Override
	public Customer createCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepository.save(customer);
	}

	@Override
	public List<Customer> findAllCustomer() {
		// TODO Auto-generated method stub
		return customerRepository.findAll();
	}

	@Override
	public void deleteCustomer(int id) {
		// TODO Auto-generated method stub
		customerRepository.deleteById(id);
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		Customer _customer = customerRepository.findById(customer.getId()).get();
		_customer.setName(customer.getName());
		_customer.setMobno(customer.getMobno());
		_customer.setAddress(customer.getAddress());
		return customerRepository.save(_customer);
	}

	@Override
	public List<Customer> findByid(int id) {
		// TODO Auto-generated method stub
		return customerRepository.findByid(id);
	}

}
