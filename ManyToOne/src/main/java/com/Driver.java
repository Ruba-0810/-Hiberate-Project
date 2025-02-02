package com;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Driver {
	
	
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		
		Company c1= new Company();
		c1.setAddress("Chennai");
		c1.setCeo("TATA");
		c1.setEmail("tata@gmail.com");
		c1.setName("TCS");
		
		Employee e1= new Employee();
		e1.setName("Ruba");
		e1.setEmail("ruba0810@gmail.com");
		e1.setGender("Female");
		e1.setSal(150000);
		e1.setPhone(1234567543);
		e1.setCompany(c1);
		
		Employee e2= new Employee();
		e2.setName("Raja");
		e2.setEmail("raja0810@gmail.com");
		e2.setGender("male");
		e2.setSal(100000);
		e2.setPhone(98765678);
		e2.setCompany(c1);
		
		Employee e3= new Employee();
		e3.setName("Naresh");
		e3.setEmail("naresh0810@gmail.com");
		e3.setGender("male");
		e3.setSal(130000);
		e3.setPhone(7697890);
		e3.setCompany(c1);
		
		
		et.begin();
		em.persist(e1);
		em.persist(e2);
		em.persist(e3);
		et.commit();
		System.out.println("Data Saved");

	}

}
