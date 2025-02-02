package com.hiberate.ManyToOneuni;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Delete {
	
	public static void main(String[] args) {
		
		Configuration con =new Configuration().configure("HostelStudent.xml").addAnnotatedClass(Hostel.class).addAnnotatedClass(HostelStudent.class);
		SessionFactory sf=con.buildSessionFactory();
		Session s=sf.openSession();
		Transaction tc=s.beginTransaction();
		
		
//		HostelStudent h1=(HostelStudent)s.get(HostelStudent.class, 3);
//		if(h1!=null) {
//		  h1.setHotel(null);
//			s.delete(h1);
//			tc.commit();
//			s.close();
//			sf.close();
//			System.out.println("Data Deleted");
//		}else {
//			System.out.println("Id not found");
//		}
		HostelStudent h1=(HostelStudent)s.get(HostelStudent.class, 2);
		if(h1!=null) {
			Hostel h=h1.getHotel();
			s.delete(h);
			tc.commit();
			s.close();
			sf.close();
			System.out.println("Data Deleted");
		}
	}

}
