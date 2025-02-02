package com.hiberate.Part2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	
	public static void main(String[] args) {
		
		Laptop l1=new Laptop();
		l1.setId(111);
		l1.setBrandName("HP");
		
		Student s1=new Student();
		s1.setRollno(1);
		s1.setName("Raja");
		s1.setMark(99);
		//s1.setLaptop(l1);
		s1.getLaptop().add(l1);
		
		
		Configuration con =new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
		SessionFactory fc=con.buildSessionFactory();
		Session sc=fc.openSession();
		Transaction tc=sc.beginTransaction();
		
		sc.save(l1);
		sc.save(s1);
		 tc.commit();
		System.out.println(l1);
		System.out.println(s1);
		
	}

}
