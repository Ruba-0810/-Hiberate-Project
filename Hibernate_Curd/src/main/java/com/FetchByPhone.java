package com;

import java.util.Scanner;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class FetchByPhone {
	
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter phone number: ");
		Long phone=sc.nextLong();
		
		
		EntityManagerFactory factory =Persistence.createEntityManagerFactory("dev");
		EntityManager em= factory.createEntityManager();
		
		Query q=em.createQuery("select e1 from Employee e1 where e1.phone=?1");
		
		q.setParameter(1, phone);
		
		Employee e=(Employee) q.getSingleResult();
		
		System.out.println(e);
		
	}

}
