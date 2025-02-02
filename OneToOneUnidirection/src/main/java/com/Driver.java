package com;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Driver {
	
public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		AadharCard a=new AadharCard();
		a.setAno(17899);
		a.setDob("8/10/2002");
		a.setFatherName("Kumar");
		a.setAddress("chennai");
		a.setEmail("rakesh@gmail.com");
		
		
		Person p=new Person();
		p.setId(3);
		p.setName("Rakesh");
		p.setGender("male");
		p.setAge(21);
		p.setPhone(89798998);
		p.setAadharCard(a);
		
		et.begin();
		em.persist(p);
		em.persist(a);
		et.commit();
		
		System.out.println("data saved");
		
	}

}
