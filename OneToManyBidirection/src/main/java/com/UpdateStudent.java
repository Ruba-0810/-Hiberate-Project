package com;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class UpdateStudent {
	
	public static void main(String[] args) {
		
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction tc=em.getTransaction();
		
		
		Student s=em.find(Student.class, 1);
		
		if(s!=null) {
			System.out.println(s);
		}else {
			System.out.println("Data not present");
		}
	}

}
