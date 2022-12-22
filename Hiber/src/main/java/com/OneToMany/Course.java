package com.OneToMany;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Courses")
public class Course {
	// Declare constructor
	public Course() {
		
	}
	@Id
	
	// Data member of Course
private int cid;
private String cname;
private String Cduration;
@ManyToOne(cascade = CascadeType.ALL)  
@JoinColumn(name="tid")
private Teacher teacher;

//Declare Getter Setter Method
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public String getCduration() {
	return Cduration;
}
public void setCduration(String cduration) {
	Cduration = cduration;
}
public Teacher getTeacher() {
	return teacher;
}
public void setTeacher(Teacher teacher) {
	this.teacher = teacher;
}
}
