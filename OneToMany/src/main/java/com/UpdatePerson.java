package com;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class UpdatePerson {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Person p =em.find(Person.class,1);
		
		if(p!=null) {
			p.setName("Ruba");
			
			et.begin();
			em.merge(p);
			et.commit();
			System.out.println("Data updated");
		}else {
			System.out.println("Id not present");
		}
		
	}

}
