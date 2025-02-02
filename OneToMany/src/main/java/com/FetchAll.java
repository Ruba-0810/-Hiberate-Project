package com;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class FetchAll {
	
	public static void main(String[] args) {
		EntityManagerFactory f=Persistence.createEntityManagerFactory("dev");
		EntityManager em=f.createEntityManager();
		
		Query q=em.createQuery("select p from Person p");
		
		List<Person>  l =q.getResultList();
		
		for(Person i : l) {
			System.out.println(i);
		}
	}

}
