package com.hiberate.fetch;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import jakarta.persistence.Query;

public class FeatchByName {
	
	public static void main(String[] args) {
		
		
		Configuration con =new Configuration().configure("student.xml").addAnnotatedClass(Student.class);
		SessionFactory sf=con.buildSessionFactory();
		Session s= sf.openSession();
		String name="Vishwa";
		Query q= s.createQuery("select s from Student s where s.name=:fetch");
		q.setParameter("fetch", name);
		Student s1=(Student)q.getSingleResult();
		System.out.println(s1);
		
	}

}
