package com;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Driver {
	
	
		
		public static void main(String[] args) {
			
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
			EntityManager em=emf.createEntityManager();
			EntityTransaction et=em.getTransaction();
			
			BankAccount b1=new BankAccount();
			b1.setAccno(637548253);
			b1.setBankname("IndianBank");
			b1.setBranch("Ambattur");
			b1.setIfsc("IB8293674");
			
			BankAccount b2=new BankAccount();
			b2.setAccno(76375825);
			b2.setBankname("AxisBank");
			b2.setBranch("Annanagar");
			b2.setIfsc("Ax9364896");
			
			
			BankAccount b3=new BankAccount();
			b3.setAccno(293645426);
			b3.setBankname("CanaraBank");
			b3.setBranch("Vadapalani");
			b3.setIfsc("CN9739562");
			
			List<BankAccount> al=new ArrayList<BankAccount>();
			al.add(b1);
			al.add(b2);
			al.add(b3);
			
			
			Person p=new Person();
			p.setName("kiruthika");
			p.setPhone(638055130);
			p.setGender("female");
			p.setAddress("2/1 voc street ambattur");
			p.setBankaccounts(al);
			
			et.begin();
			em.persist(p);
			et.commit();
			
			System.out.println("data saved");
			
		}

	}



