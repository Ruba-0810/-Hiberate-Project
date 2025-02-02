package com;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class AddBankAccount {
	
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		
		 BankAccount b= new BankAccount();
		 b.setAccno(123456);
		 b.setBankname("Union");
		 b.setBranch("Koyambedu");
		 b.setIfsc("qwert123");
		 
		 Person p= em.find(Person.class, 1);
		 if(p!=null) {
			 List<BankAccount> l =p.getBankaccounts();
			 l.add(b);
			 et.begin();
			 em.persist(b);
			 em.merge(p);
			 et.commit();
			 }
		 else {
				 System.out.println("Id not found");
		 }
	}

}
