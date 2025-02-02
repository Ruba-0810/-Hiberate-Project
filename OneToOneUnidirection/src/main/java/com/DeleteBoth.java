package com;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class DeleteBoth {
	
public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();

	Person p=em.find(Person.class, 2);
	AadharCard a=p.getAadharCard();

		
		et.begin();
		em.remove(a);
		em.remove(p);
		et.commit();
		
		System.out.println("data deleted");
		
	}


}
