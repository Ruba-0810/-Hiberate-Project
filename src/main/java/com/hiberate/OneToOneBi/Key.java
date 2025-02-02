package com.hiberate.OneToOneBi;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "KeyTable")
public class Key {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int kid;
	private String kname;
	
	@OneToOne
	private Cupboard cupboard;

	public int getKid() {
		return kid;
	}

	public void setKid(int kid) {
		this.kid = kid;
	}

	public String getKname() {
		return kname;
	}

	public void setKname(String kname) {
		this.kname = kname;
	}

	public Cupboard getCupboard() {
		return cupboard;
	}

	public void setCupboard(Cupboard cupboard) {
		this.cupboard = cupboard;
	}

	@Override
	public String toString() {
		return "Key [kid=" + kid + ", kname=" + kname + "]";
	}
	
	

}
