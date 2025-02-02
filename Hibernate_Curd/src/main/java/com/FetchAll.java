package com;

import java.util.List;
import java.util.Queue;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class FetchAll {                           //getResultList()  method------>JPQL
	
	public static void main(String[] args) {
		
		EntityManagerFactory manager=Persistence.createEntityManagerFactory("dev");
		EntityManager e=manager.createEntityManager();
		
		Query q=e.createQuery("select e from Employee e");
		
		List<Employee> l =q.getResultList();
		
		for(Employee e1 : l) {
			System.out.println(e1);
		}
		
	}

}
