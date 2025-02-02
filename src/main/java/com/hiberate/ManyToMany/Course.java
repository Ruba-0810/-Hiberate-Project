package com.hiberate.ManyToMany;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cid;
	private String coursename;
	
	@ManyToMany
	private List<Student> s;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	public List<Student> getS() {
		return s;
	}

	public void setS(List<Student> s) {
		this.s = s;
	}

	@Override
	public String toString() {
		return "Course [cid=" + cid + ", coursename=" + coursename + "]";
	}
	
	

}
