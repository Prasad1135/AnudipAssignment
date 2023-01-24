package com.example.Model;

import javax.persistence.CascadeType;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Mobile {

		//Generate parameterized Constructor
		public Mobile(int mid, String mname, int quentity, int price) {
		super();
		this.mid = mid;
		this.mname = mname;
		this.quentity = quentity;
		this.price = price;
	}
		public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}
		@Id
	 private int mid;
	  private String mname;
	  private int quentity;
	  private int price;
	public int getMid() {
		return mid;
	}
	//Generete Getter Setter Method
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public int getQuentity() {
		return quentity;
	}
	public void setQuentity(int quentity) {
		this.quentity = quentity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
