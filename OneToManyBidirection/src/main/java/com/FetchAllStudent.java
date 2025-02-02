package com;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class FetchAllStudent {
	
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction tc=em.getTransaction();
		
		
		Query q=em.createQuery("select s from Student s");
		List<Student> l=q.getResultList();
		for(Student s: l) {
			System.out.println(s);
		}
	}

}
