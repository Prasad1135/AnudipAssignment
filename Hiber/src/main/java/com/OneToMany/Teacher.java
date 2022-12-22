package com.OneToMany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name ="Teacher_Info")
public class Teacher {
//Declare Constructor
	public Teacher() {

	}

	@Id
	// Datamember Of Teacher
	private int tid;
	private String tname;
	private String tsub;
	// create onetomany relation between Teacher and Course
	@OneToMany(cascade = CascadeType.ALL)  
	@GeneratedValue(strategy=GenerationType.TABLE)  
	private List<Course> course;

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getTsub() {
		return tsub;
	}

	public void setTsub(String tsub) {
		this.tsub = tsub;
	}

	public List<Course> getCourse() {
		return course;
	}

	public void setCourse(List<Course> course) {
		this.course = course;
	}
}
