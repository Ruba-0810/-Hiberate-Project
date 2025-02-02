package com;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class UpdateBatch {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction tc=em.getTransaction();
		
		Batch b=em.find(Batch.class,1);
		
		if(b!=null) {
			System.out.println(b);
		}else {
			System.out.println("Not present");
		}
	}

}
