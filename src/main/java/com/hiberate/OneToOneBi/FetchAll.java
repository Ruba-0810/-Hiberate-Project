package com.hiberate.OneToOneBi;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import jakarta.persistence.Query;

public class FetchAll {
	
	public static void main(String[] args) {

		Configuration con= new Configuration().configure("key.xml").addAnnotatedClass(Key.class).addAnnotatedClass(Cupboard.class);
		 SessionFactory sf=con.buildSessionFactory();
		 Session s=sf.openSession();
		 Transaction tc=s.beginTransaction();
		
		 
		 Query q=s.createQuery("select c from Cupboard c");
		 List<Cupboard> l=q.getResultList();
		 for(Cupboard i : l) {
			 System.out.println(i);
		 }
		 
		 Query q1=s.createQuery("select k from Key k");
		 List<Key> k=q1.getResultList();
		 for(Key i :k) {
			 System.out.println(i);
		 }
		 
	}

}
