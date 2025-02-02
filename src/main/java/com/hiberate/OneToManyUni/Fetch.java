package com.hiberate.OneToManyUni;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import jakarta.persistence.Query;

public class Fetch {
	
	public static void main(String[] args) {
		
		Configuration con=new Configuration().configure("BusPassenger.xml").addAnnotatedClass(Bus.class).addAnnotatedClass(Passanger.class);
		SessionFactory sf=con.buildSessionFactory();
		Session sc=sf.openSession();
		Transaction tc=sc.beginTransaction();
		
		Query q= sc.createQuery("select b from Bus b");
		List<Bus> b=q.getResultList();
		
		for(Bus i: b) {
			System.out.println(i);
		}
		
		Query q1=sc.createQuery("select p from Passanger p");
		List<Passanger> p=q1.getResultList();
		for(Passanger i : p) {
			System.out.println(i);
		}
		
		

	}

}
