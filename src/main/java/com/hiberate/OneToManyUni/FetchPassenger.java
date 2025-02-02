package com.hiberate.OneToManyUni;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import jakarta.persistence.Query;

public class FetchPassenger {
	
	public static void main(String[] args) {
		
		Configuration con=new Configuration().configure("BusPassenger.xml").addAnnotatedClass(Bus.class).addAnnotatedClass(Passanger.class);
		SessionFactory sf=con.buildSessionFactory();
		Session sc=sf.openSession();
		Transaction tc=sc.beginTransaction();
		
		Bus b1=(Bus)sc.get(Bus.class, 1);
		List<Passanger> l=b1.getPassenger();
		Passanger p1=l.get(0);
		int  i=p1.getSeatno();
		Query q=sc.createQuery("select p from Passanger p where p.seatno=:id");
		q.setParameter("id", i);
		Passanger ans=(Passanger)q.getSingleResult();
		System.out.println(ans);

	}

}
