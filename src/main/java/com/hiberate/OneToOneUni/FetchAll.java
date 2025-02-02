package com.hiberate.OneToOneUni;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import jakarta.persistence.Query;

public class FetchAll {
	
	public static void main(String[] args) {
		
		Configuration con =new Configuration().configure("person.cfg.xml").addAnnotatedClass(Person.class).addAnnotatedClass(Vote.class);
		SessionFactory sf=con.buildSessionFactory();
		Session s= sf.openSession();
		Transaction tc=s.beginTransaction();
		
		Query q= s.createQuery("select p from Person p");
		List<Person> p=q.getResultList();
		
		for(Person i: p) {
			System.out.println(i);
		}
		
		Query q1 =s.createQuery("select v from Vote v");
		List<Vote> v=q1.getResultList();
		for(Vote i: v) {
			System.out.println(i);
		}
		
		
	}

}
