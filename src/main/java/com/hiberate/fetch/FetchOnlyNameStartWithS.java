package com.hiberate.fetch;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import jakarta.persistence.Query;

public class FetchOnlyNameStartWithS {
	
	public static void main(String[] args) {
		
		Configuration con =new Configuration().configure("student.xml").addAnnotatedClass(Student.class);
		SessionFactory sf=con.buildSessionFactory();
		Session s= sf.openSession();
		
		Query q=s.createQuery("select s.name from Student s where s.name like 's%'");
		List<String> l =q.getResultList();
		for(String i : l) {
			System.out.println(i);
		}
		
	}

}
