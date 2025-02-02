package com.hiberate.OneToOneUni;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import jakarta.persistence.Query;

public class FetchById {
	
	public static void main(String[] args) {
		
		Configuration con =new Configuration().configure("person.cfg.xml").addAnnotatedClass(Person.class).addAnnotatedClass(Vote.class);
		SessionFactory sf=con.buildSessionFactory();
		Session s= sf.openSession();
        Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
		Query q=s.createQuery("select p from Person p where  p.bid=:id");
		q.setParameter("id", n);
		Person p =(Person)q.getSingleResult();
		System.out.println(p);
		
		Vote v1=p.getVote();
		int id=v1.getVoteid();
	    Query q1=s.createQuery("select v from Vote v where v.voteid=:id");
	    q1.setParameter("id", id);
	    Vote v=(Vote)q1.getSingleResult();
	    System.out.println(v);
	}

}
