package com.example.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Model.Mobile;

public interface MobileRepository extends JpaRepository<Mobile, Integer> {
	//Customize Method
	//List<Mobile> findByid(int id);
	
}


