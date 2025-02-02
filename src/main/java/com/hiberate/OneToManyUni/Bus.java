package com.hiberate.OneToManyUni;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Bus {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bid;
	private String start;
	private String end;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Passanger> passenger;

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	

	public List<Passanger> getPassenger() {
		return passenger;
	}

	public void setPassenger(List<Passanger> passenger) {
		this.passenger = passenger;
	}

	@Override
	public String toString() {
		return "Bus [bid=" + bid + ", start=" + start + ", end=" + end + ", passenger=" + passenger + "]";
	}	

}
