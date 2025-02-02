package com;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class FetchAllBatch {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();

		Query q= em.createQuery("select b from Batch b");
		
		List<Batch> l= q.getResultList();
		
		for(Batch b : l) {
			System.out.println(b);
		}
		
	}

}
