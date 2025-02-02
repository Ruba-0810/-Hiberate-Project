package com.hiberate.Part3;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Driver {
	public static void main(String[] args) {
		
		Employee e1=new Employee();
		e1.setName("Roobi");
		e1.setRollno(3);
		e1.setSal(12000);
		e1.setName("Raja");
		e1.setRollno(4);
		e1.setSal(12000);
		e1.setName("Rose");
		e1.setRollno(5);
		e1.setSal(12000);

		
		Configuration con =new Configuration().configure("employee.cfg.xml").addAnnotatedClass(Employee.class);
		SessionFactory fc=con.buildSessionFactory();
		Session session =fc.openSession();// interation between java and database
		Transaction table =session.beginTransaction();// update into database
		session.save(e1);
		table.commit();
	}

}
