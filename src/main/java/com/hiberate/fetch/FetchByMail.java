package com.hiberate.fetch;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import jakarta.persistence.Query;

public class FetchByMail {
	
	public static void main(String[] args) {
		
		
		Configuration con =new Configuration().configure("student.xml").addAnnotatedClass(Student.class);
		SessionFactory sf=con.buildSessionFactory();
		Session s= sf.openSession();
		
		
		Query q= s.createQuery("select s from Student s where s.mail='raja0810@gmail.com'");
		Student s1=(Student)q.getSingleResult();
		System.out.println(s1);
	}

}
