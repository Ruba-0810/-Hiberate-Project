package com.hiberate.ManyToOneuni;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Hostel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int hostelid;
	private String name;
	private String address;
	
	
	public int getHostelid() {
		return hostelid;
	}
	public void setHostelid(int hostelid) {
		this.hostelid = hostelid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Hostel [hostelid=" + hostelid + ", name=" + name + ", address=" + address + "]";
	}
	
	
	
	

}
