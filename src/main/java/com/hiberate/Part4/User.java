package com.hiberate.Part4;

import java.util.ArrayList;
import java.util.Collection;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userId;
	private String userName;
	@ElementCollection
	@JoinTable
	private Collection<Address> lisOfAddresses = new ArrayList<Address>();
	
	public Collection<Address> getLisOfAddresses() {
		return lisOfAddresses;
		}
		public void setLisOfAddresses(Collection<Address> lisOfAddresses) {
		this.lisOfAddresses = lisOfAddresses;
		}
		public int getUserId() {
		return userId;
		}
		public void setUserId(int userId) {
		this.userId = userId;
		}
		public String getUserName() {
		return userName;
		}
		public void setUserName(String userName) {
		this.userName = userName;
		}
		@Override
		public String toString() {
			return "User [userId=" + userId + ", userName=" + userName + ", lisOfAddresses=" + lisOfAddresses + "]";
		}
		
	

}
