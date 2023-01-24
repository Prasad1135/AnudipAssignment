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
import com.example.Model.Mobile;
import com.example.Repository.CustomerRepository;
import com.example.Repository.MobileRepository;
import com.example.Services.CustomerServices;
import com.example.Services.MobileServices;

@SpringBootTest
public class MobileRepositoryTest {
	@MockBean
	private MobileRepository mobileRepository;
	@Autowired
	private MobileServices mobileServices;

	// Test SaveMobile Method
	@Test
	void testSaveMOBILE() {
		Mobile m = new Mobile(1, "Samsung", 3, 20000);
		Mockito.when(mobileRepository.save(m)).thenReturn(m);
		assertEquals(m, mobileServices.createMobile(m));
	}

	// Test GetAllMobile Method
	@Test
	void testGetAllMOBILE() {
		List<Mobile> Mobile = Stream.of(new Mobile(1, "Samsung", 3, 20000), new Mobile(1, "Samsung", 3, 20000))
				.collect(Collectors.toList());
		Mockito.when(mobileRepository.findAll()).thenReturn(Mobile);
		assertEquals(2, mobileServices.findAllMobile().size());

	}

	// Test DeleteMobile Method
	@Test
	void testDeleteMobile() {
		mobileServices.deleteMobile(1);
		Mockito.verify(mobileRepository).deleteById(1);
	}

}
