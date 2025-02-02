package com.hiberate.fetch;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import jakarta.persistence.Query;

public class FetchById {
	
	public static void main(String[] args) {

		Configuration con =new Configuration().configure("student.xml").addAnnotatedClass(Student.class);
		SessionFactory sf=con.buildSessionFactory();
		Session s= sf.openSession();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter is: ");
		int n=sc.nextInt();
		
		Query q=s.createQuery("select s from Student s where s.id=?1");
		q.setParameter(1, n);
		Student s1=(Student)q.getSingleResult();
		System.out.println(s1);
		
		
			
	
	}

}
