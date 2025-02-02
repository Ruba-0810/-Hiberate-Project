package com;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Delete {
	

	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		//1st delete parent class and delete child class....... person<<<<child.....becoz of foreign key 
		// Person p=em.find(Person.class, 1);
		AadharCard a=em.find(AadharCard.class, 34526);
	   // Person p=em.find(Person.class, 1);

		
		et.begin();
		em.remove(a);
		et.commit();
		
		System.out.println("data deleted");
		
	}


}
