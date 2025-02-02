package com;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;


@Entity
public class Batch {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bid;
	private String subject;
	private String trainer;
	private String timing;
	private int roomno;
	private int noofstudent;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Student> students;

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
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

	public String getTiming() {
		return timing;
	}

	public void setTiming(String timing) {
		this.timing = timing;
	}

	public int getRoomno() {
		return roomno;
	}

	public void setRoomno(int roomno) {
		this.roomno = roomno;
	}

	public int getNoofstudent() {
		return noofstudent;
	}

	public void setNoofstudent(int noofstudent) {
		this.noofstudent = noofstudent;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Batch [bid=" + bid + ", subject=" + subject + ", trainer=" + trainer + ", timing=" + timing
				+ ", roomno=" + roomno + ", noofstudent=" + noofstudent + "]";
	}

	
	

}
