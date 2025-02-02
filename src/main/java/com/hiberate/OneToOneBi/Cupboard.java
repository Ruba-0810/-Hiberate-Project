package com.hiberate.OneToOneBi;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Cupboard {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cid;
	private String cupboardtype;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Key key;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCupboardtype() {
		return cupboardtype;
	}

	public void setCupboardtype(String cupboardtype) {
		this.cupboardtype = cupboardtype;
	}

	public Key getKey() {
		return key;
	}

	public void setKey(Key key) {
		this.key = key;
	}

	@Override
	public String toString() {
		return "Cupboard [cid=" + cid + ", cupboardtype=" + cupboardtype + "]";
	}
	
	

}
