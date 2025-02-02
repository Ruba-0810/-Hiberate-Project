package com;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class DeletePerson {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Person p= em.find(Person.class, 1);
		
		if(p!=null) {
			et.begin();
			em.remove(p);
			et.commit();
			System.out.println("Data deleted");
		}else {
			System.out.println("Id not present");
		}
		
	}

}
