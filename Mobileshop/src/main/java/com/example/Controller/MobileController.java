package com.example.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Model.Mobile;
import com.example.Services.MobileServices;

//Controller Method
@RestController
public class MobileController {
	@Autowired
	MobileServices mobileservices;

	//Create Mobile
	@PostMapping("/Mobile")
	public ResponseEntity<Mobile> craetePatient(@Valid @RequestBody Mobile mobile) {
		return new ResponseEntity<Mobile>(mobileservices.createMobile(mobile), HttpStatus.CREATED);
	}
	
	//Get All Mobile
	@GetMapping(value = "/Mobile")
	public List<Mobile> findAllMobile() {
		return mobileservices.findAllMobile();
	}

	//Delete By Id
	@DeleteMapping(value = "/Mobile/{id}")
	public String deleteMobile(@PathVariable int id) {
		mobileservices.deleteMobile(id);
		return "Patient is deleted";
	}

	//Update By Id
	@PutMapping(value = "/Mobile")
	public Mobile updateMobile(@RequestBody Mobile mobile) {
		return mobileservices.updatemobile(mobile);
	}
	
	/*//Find By Id
	@GetMapping(value="/Mobile/id/{id}")
	public List<Mobile>findByid(@PathVariable int id){
		return mobileservices.findByid(id);
	}*/
	
}