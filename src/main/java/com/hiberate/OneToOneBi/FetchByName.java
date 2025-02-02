package com.hiberate.OneToOneBi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import jakarta.persistence.Query;

public class FetchByName {
	
	public static void main(String[] args) {
		Configuration con= new Configuration().configure("key.xml").addAnnotatedClass(Key.class).addAnnotatedClass(Cupboard.class);
		 SessionFactory sf=con.buildSessionFactory();
		 Session s=sf.openSession();
		 Transaction tc=s.beginTransaction();
		 
		 Query q= s.createQuery("select k from Key k where k.kname='ABC Key'");
		 Key c1=(Key)q.getSingleResult();
		 System.out.println(c1);
		 
		 Query q1=s.createQuery("select c from Cupboard c where c.cupboardtype='Neem tree'");
		 Cupboard c2=(Cupboard)q1.getSingleResult();
		 System.out.println(c2);
		 
	}

}
