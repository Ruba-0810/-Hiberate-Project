package com.hiberate.Part4;

import org.hibernate.AnnotationException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hiberate.Part3.Employee;

public class Driver {
	
	public static void main(String[] args) {
		User user = new User();

		
		user.setUserName("Dinesh Rajput");

		Address address1 = new Address();
		address1.setStreet("First Street");
		address1.setCity("First City");
		address1.setState("First State");
		address1.setPincode("First Pin");

		Address address2 = new Address();
		address2.setStreet("Second Street");
		address2.setCity("Second City");
		address2.setState("Second State");
		address2.setPincode("Second Pin");

		user.getLisOfAddresses().add(address1);
		user.getLisOfAddresses().add(address2);
		Configuration con = new Configuration().configure().addAnnotatedClass(User.class);
		SessionFactory fc=con.buildSessionFactory();
		Session session =fc.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();
		
	}

}
