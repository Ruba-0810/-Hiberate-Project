package com;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class FetchOnlyName { //----------> get by name so query will change
	
	public static void main(String[] args) {
		
		
		EntityManagerFactory f= Persistence.createEntityManagerFactory("dev");
		EntityManager em= f.createEntityManager();
		
		Query q=em.createQuery("select e.name from Employee e");
		List<String> l =q.getResultList();
		
		System.out.println(l);
		
		}

}
