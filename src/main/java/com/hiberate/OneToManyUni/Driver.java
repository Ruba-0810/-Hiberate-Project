package com.hiberate.OneToManyUni;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Driver {
	
	public static void main(String[] args) {
		
		
		Bus b1=new Bus();
		b1.setStart("T Nager");
		b1.setEnd("Tambaram");
		
		Passanger p1=new Passanger();
		p1.setName("shree");
		p1.setStopname("mess");

		Passanger p2=new Passanger();
		p2.setName("sri");
		p2.setStopname("airport");

		Passanger p3=new Passanger();
		p3.setName("Dhana");
		p3.setStopname("west tambaram");
		
		
		ArrayList<Passanger> list=new ArrayList<>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		b1.setPassenger(list);
		
		Configuration con=new Configuration().configure("BusPassenger.xml").addAnnotatedClass(Bus.class).addAnnotatedClass(Passanger.class);
		SessionFactory sf=con.buildSessionFactory();
		Session sc=sf.openSession();
		Transaction tc=sc.beginTransaction();
		
		sc.save(b1);
		sc.save(p1);
		tc.commit();
		sc.close();
		sf.close();
		System.out.println("Data saved");
		
	}

}
