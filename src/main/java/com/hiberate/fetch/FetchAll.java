package com.hiberate.fetch;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import jakarta.persistence.Query;


public class FetchAll {
	
	public static void main(String[] args) {
		
		Configuration con =new Configuration().configure("student.xml").addAnnotatedClass(Student.class);
		SessionFactory sf=con.buildSessionFactory();
		Session s= sf.openSession();
		
		Query q=s.createQuery("select s from Student s");
		List<Student> l =q.getResultList();
		
		for(Student i : l) {
			System.out.println(i);
		}
	}

}
