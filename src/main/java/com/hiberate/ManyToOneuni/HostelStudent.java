package com.hiberate.ManyToOneuni;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;


@Entity
public class HostelStudent {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int roomno;
	private String name;
	private String snative;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Hostel hotel;

	public int getRoomno() {
		return roomno;
	}

	public void setRoomno(int roomno) {
		this.roomno = roomno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSnative() {
		return snative;
	}

	public void setSnative(String snative) {
		this.snative = snative;
	}

	public Hostel getHotel() {
		return hotel;
	}

	public void setHotel(Hostel hotel) {
		this.hotel = hotel;
	}

	@Override
	public String toString() {
		return "HostelStudent [roomno=" + roomno + ", name=" + name + ", snative=" + snative + ", hotel=" + hotel + "]";
	}
	
	
	
	
	

}
