package com.hiberate.OneToManyUni;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Passanger {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int seatno;
	private String name;
	private String stopname;
	public int getSeatno() {
		return seatno;
	}
	public void setSeatno(int seatno) {
		this.seatno = seatno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStopname() {
		return stopname;
	}
	public void setStopname(String stopname) {
		this.stopname = stopname;
	}
	@Override
	public String toString() {
		return "Passanger [seatno=" + seatno + ", name=" + name + ", stopname=" + stopname + "]";
	}
	
	

}
