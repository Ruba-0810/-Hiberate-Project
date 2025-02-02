package com;

import java.util.List;
import java.util.Scanner;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class FetchBySal {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter starting salary :");
		double start=sc.nextDouble();
		System.out.print("Enter starting salary :");
		double end=sc.nextDouble();
		
		EntityManagerFactory f=Persistence.createEntityManagerFactory("dev");
		EntityManager em=f.createEntityManager();
		
		
		Query q=em.createQuery("select e from Employee e where e.sal between :start and :end");
		q.setParameter("start", start);
		q.setParameter("end", end);
		
		List<Employee> l =q.getResultList();
		
		for(Employee e1 : l) {
			System.out.println(e1);
		}
		
	}

}
