package com.hiberate.ManyToOneuni;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Update {
	
	public static void main(String[] args) {
		Configuration con =new Configuration().configure("HostelStudent.xml").addAnnotatedClass(Hostel.class).addAnnotatedClass(HostelStudent.class);
		SessionFactory sf=con.buildSessionFactory();
		Session s=sf.openSession();
		Transaction tc=s.beginTransaction();
		
		HostelStudent h1=(HostelStudent)s.get(HostelStudent.class, 2);
		if(h1!=null) {
			 System.out.println("Fetched Student: " + h1);
			h1.setName("Kavya");
			h1.setSnative("Coimbatore");
			Hostel h2=h1.getHotel();
			h2.setName("ABC");
			
			s.update(h1);
			tc.commit();
			s.close();
			sf.close();
			System.out.println("Data updated");
		}else {
			System.out.println("Id Not present");
		}
	}

}
