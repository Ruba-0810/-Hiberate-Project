package com.hiberate.OneToManyBi;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class ClassRoom {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int roomno;
	private String subject;
	private String trainer;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Student> s;

	public int getRoomno() {
		return roomno;
	}

	public void setRoomno(int roomno) {
		this.roomno = roomno;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getTrainer() {
		return trainer;
	}

	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}

	public List<Student> getS() {
		return s;
	}

	public void setS(List<Student> s) {
		this.s = s;
	}

	@Override
	public String toString() {
		return "ClassRoom [roomno=" + roomno + ", subject=" + subject + ", trainer=" + trainer + "]";
	}
	
	
	

}
