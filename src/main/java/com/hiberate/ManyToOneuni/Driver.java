package com.hiberate.ManyToOneuni;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Driver {
	
	public static void main(String[] args) {
		
		Hostel h1=new Hostel();
		h1.setName("Thagam hostel");
		h1.setAddress("vadaplanai");
		
		HostelStudent s1=new HostelStudent();
		s1.setName("Shree");
		s1.setSnative("Andhra");
		s1.setHotel(h1);
		
		HostelStudent s2=new HostelStudent();
		s2.setName("Shree");
		s2.setSnative("Andhra");
		s2.setHotel(h1);
		
		HostelStudent s3=new HostelStudent();
		s3.setName("Shree");
		s3.setSnative("Andhra");
		s3.setHotel(h1);
		
		HostelStudent s4=new HostelStudent();
		s4.setName("Shree");
		s4.setSnative("Andhra");
		s4.setHotel(h1);
		
		
		Configuration con =new Configuration().configure("HostelStudent.xml").addAnnotatedClass(Hostel.class).addAnnotatedClass(HostelStudent.class);
		SessionFactory sf=con.buildSessionFactory();
		Session s=sf.openSession();
		Transaction tc=s.beginTransaction();
		s.save(h1);
		s.save(s1);
		s.save(s2);
		s.save(s3);
		tc.commit();
		s.close();
		sf.close();
		System.out.println("Data Saved");
		
		
	}

}
