package com.example.Services;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Model.Mobile;



@Service
public interface MobileServices {
	Mobile createMobile(Mobile mobile);
	List<Mobile> findAllMobile();
	void deleteMobile(int mid);
	Mobile updatemobile(Mobile mobile);
	//List<Mobile>findByid(int mid);
}
