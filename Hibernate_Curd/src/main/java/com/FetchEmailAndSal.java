package com;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class FetchEmailAndSal {          //--------------> two data store in one container
	
	public static void main(String[] args) {
		
		
		EntityManagerFactory f=Persistence.createEntityManagerFactory("dev");
		EntityManager em=f.createEntityManager();
		
		Query q=em.createQuery("select e.email,e.sal from Employee e");
		List<Object[]> l =q.getResultList();
		//object[] =["ruba",12]
		//object[] =["rose",12]
		//object[] =["shree",12]
		
		for(Object[] arr : l) {
			System.out.println(" Email =" + arr[0] + " Salary :" + arr[1] );
		}
		
	}

}
