package com.hiberate.OneToOneUni;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Driver {
	
	public static void main(String[] args) {
		
		
		Person p1=new Person();
		p1.setFname("Siva");
		p1.setLname("M");
		Vote v1=new Vote();
		v1.setAddress("Madurai");
		p1.setVote(v1);
		
		 Configuration con= new Configuration().configure("person.cfg.xml").addAnnotatedClass(Person.class).addAnnotatedClass(Vote.class);
		 SessionFactory sf=con.buildSessionFactory();
		 Session s=sf.openSession();
		 Transaction tc=s.beginTransaction();

		 s.save(p1);
		 tc.commit();
		 s.close();
		 System.out.println("Data saved");
	}

}
