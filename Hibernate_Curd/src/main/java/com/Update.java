package com;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Update {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Employee e = em.find(Employee.class, 1);
		
		if(e!=null) {
			
			e.setPhone(9984757);
			
			et.begin();
			em.merge(e);
			et.commit();
			
			System.out.println("Data Updated");
			
		}else {
			System.out.println("id not found");
		}
		
	}

}


