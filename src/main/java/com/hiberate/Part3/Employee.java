package com.hiberate.Part3;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
//@Table(name="Employee_info")
public class Employee {
	@Id
	private int rollno;
	private String name;
	@Column(name="salary" , nullable = true)
	private double sal;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [rollno=" + rollno + ", name=" + name + ", sal=" + sal + "]";
	}
	
	

}
