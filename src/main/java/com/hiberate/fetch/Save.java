package com.hiberate.fetch;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Save {
	
	public static void main(String[] args) {
		
		Student s1=new Student();
	
		s1.setName("suresh");
		s1.setAge("22");
		s1.setMail("suresh0810@gmail.com");
		
		Configuration c=new Configuration().configure("student.xml").addAnnotatedClass(Student.class);
		SessionFactory sf=c.buildSessionFactory();
		Session s= sf.openSession();
		Transaction tc=s.beginTransaction();
		s.save(s1);
		tc.commit();
		s.close();
		sf.close();
		System.out.println("Data Saved");
		
	}

}
