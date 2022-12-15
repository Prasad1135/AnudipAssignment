package com.example;

import javax.persistence.Embeddable;

@Embeddable //Use for component key
public class Address {
	public Address() {
		
	}
	//private variable of Address class
	private String ehname;
	private String earea;
	private String ecity;
	private  int epincode;
	// getter setter method of variable
	public String getEhname() {
		return ehname;
	}
	public void setEhname(String ehname) {
		this.ehname = ehname;
	}
	public String getEarea() {
		return earea;
	}
	public void setEarea(String earea) {
		this.earea = earea;
	}
	public String getEcity() {
		return ecity;
	}
	public void setEcity(String ecity) {
		this.ecity = ecity;
	}
	public int getEpincode() {
		return epincode;
	}
	public void setEpincode(int epincode) {
		this.epincode = epincode;
	}
}
