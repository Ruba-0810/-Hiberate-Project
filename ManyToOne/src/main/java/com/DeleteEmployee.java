package com;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class DeleteEmployee {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Employee e1=em.find(Employee.class, 4);
         		
		if(e1!=null) {
			et.begin();
			em.remove(e1);
			et.commit();
			System.out.println("Data Deleted");
		}
		else {
			System.out.println("Id not present");
		}
	}

}
