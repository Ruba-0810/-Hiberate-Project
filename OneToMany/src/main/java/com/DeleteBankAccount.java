package com;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class DeleteBankAccount {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		BankAccount b=em.find(BankAccount.class, 1234567);
		Person p= em.find(Person.class, 1);
		
		List<BankAccount> l =p.getBankaccounts();
		l.remove(b); //removing connection between parent and child
		
		et.begin();
		em.merge(b);
		em.remove(b);
		et.commit();
		}

}
