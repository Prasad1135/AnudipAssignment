package com.example.Services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.Model.Mobile;
import com.example.Repository.MobileRepository;
import com.example.Services.MobileServices;
@Repository
public class MobileServicesimpl implements MobileServices {
@Autowired
MobileRepository mobileRepository;
	@Override
	public Mobile createMobile(Mobile mobile) {
		// TODO Auto-generated method stub
		return mobileRepository.save(mobile);
	}

	@Override
	public List<Mobile> findAllMobile() {
		// TODO Auto-generated method stub
		return mobileRepository.findAll();
	}

	@Override
	public void deleteMobile(int mid) {
		// TODO Auto-generated method stub
		mobileRepository.deleteById(mid);
	}

	@Override
	public Mobile updatemobile(Mobile mobile) {
		// TODO Auto-generated method stub
		Mobile _mobile = mobileRepository.findById(mobile.getMid()).get();
		_mobile.setMname(mobile.getMname());
		_mobile.setPrice(mobile.getPrice());
		_mobile.setQuentity(mobile.getQuentity());
		
		return mobileRepository.save(_mobile);
		
	}

	/*@Override
	public List<Mobile> findByid(int mid) {
		// TODO Auto-generated method stub
		return mobileRepository.findByid(mid);
	}*/

}
