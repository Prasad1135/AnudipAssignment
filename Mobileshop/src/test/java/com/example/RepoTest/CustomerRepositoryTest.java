package com.example.RepoTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.Model.Customer;
import com.example.Repository.CustomerRepository;
import com.example.Services.CustomerServices;

@SpringBootTest
public class CustomerRepositoryTest {
	@MockBean
	private CustomerRepository customerRepository;
	@Autowired
	private CustomerServices customerServices;

	// Test SaveCustomer Method
	@Test
	void testSaveCUSTOMER() {
		Customer c = new Customer(1, "Ganesh","Hadapsar",777);
		Mockito.when(customerRepository.save(c)).thenReturn(c);
		assertEquals(c,customerServices.createCustomer(c));
	}

	// Test GetAllCustomer Method
	@Test
	void testGetAllCUSTOMER() {
		List<Customer> Customer = Stream
				.of(new Customer(1, "Ganesh","Hadapsar",777),
						new Customer(1, "Ganesh","Hadapsar",777))
				.collect(Collectors.toList());
		Mockito.when(customerRepository.findAll()).thenReturn(Customer);
		assertEquals(2, customerServices.findAllCustomer().size());

	}

	// Test DeleteCustomer Method
	@Test
	void testDeleteCustomer() {
		customerServices.deleteCustomer(1);
		Mockito.verify(customerRepository).deleteById(1);
	}

}
