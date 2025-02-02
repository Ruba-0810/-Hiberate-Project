package com.hiberate.OneToOneUni;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Update {
	
	public static void main(String[] args) {
		
		Configuration con =new Configuration().configure("person.cfg.xml").addAnnotatedClass(Person.class).addAnnotatedClass(Vote.class);
		SessionFactory sf=con.buildSessionFactory();
		Session s= sf.openSession();
		Transaction tc=s.beginTransaction();
		
		
		Person p1= (Person)s.get(Person.class, 1);
		if(p1!=null) {
			p1.setFname("Sangavi");
			p1.setLname("S");
			Vote v1=p1.getVote();
			v1.setAddress("Saravanamati");
			s.update(p1);
			tc.commit();
			s.close();
			sf.close();
			System.out.println("Data update");
		}else {
			System.out.println("Id not found");
		}
		
	}

}
