package com.hiberate.OneToOneUni;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Delete {
	
	public static void main(String[] args) {
		
		Configuration con =new Configuration().configure("person.cfg.xml").addAnnotatedClass(Person.class).addAnnotatedClass(Vote.class);
		SessionFactory sf=con.buildSessionFactory();
		Session s= sf.openSession();
		Transaction tc=s.beginTransaction();
		
		Person p1=(Person)s.get(Person.class, 2);
		if(p1!=null) {
			
			s.delete(p1);;
			tc.commit();
			s.close();
			sf.close();
			System.out.println("Data Delete");
		}else {
			System.out.println("Id not found");
		}
	}

}
