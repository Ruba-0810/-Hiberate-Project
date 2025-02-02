package com;

import java.util.Scanner;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class FetchByEmail_NamedParameter {
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter email");
		String email=sc.next();
		
		EntityManagerFactory factory =Persistence.createEntityManagerFactory("dev");
		EntityManager em=factory.createEntityManager();
		
		Query q= em.createQuery("select e from Employee e where e.email=:ruba");
		q.setParameter("ruba", email);
		Object o=q.getSingleResult();
		
		Employee e=(Employee)o;
		
		
		System.out.println(e);
	}

}
