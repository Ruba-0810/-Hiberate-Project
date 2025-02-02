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
		a.setDob("02/11/2003");
		a.setFathername("saravanan");
		a.setAddress("2/1 voc street ambattur");
		a.setEmail("03kiruthika@gmail.com");
		
		
		Person p=new Person();
		p.setName("kiruthika");
		p.setGender("female");
		p.setAge(21);
		p.setPhone(80551306);
		p.setAadharcard(a);
		
		a.setPerson(p);
		
		et.begin();
		em.persist(p);
		em.persist(a);
		et.commit();
		
		System.out.println("data saved");
		
	}


}
