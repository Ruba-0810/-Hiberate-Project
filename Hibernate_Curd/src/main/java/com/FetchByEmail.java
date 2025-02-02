package com;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class FetchByEmail {
	
	public static void main(String[] args) {            //getSingleResult() method------>JPQL
		
		EntityManagerFactory factory =Persistence.createEntityManagerFactory("dev");
		EntityManager em=factory.createEntityManager();
		
		Query q= em.createQuery("select e from Employee e where e.email='rakesh@gmail.com'");
		
		Object o=q.getSingleResult();
		
		Employee e=(Employee)o;
		
		/*
		 OR 
		
		Employee e=(Employee)q.getSingleResult();
		 */
		
		System.out.println(e);
	}

}
