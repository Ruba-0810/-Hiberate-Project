package com.hiberate.fetch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import jakarta.persistence.Query;

public class FetchInOperation {
	
	public static void main(String[] args) {
		
		Configuration con =new Configuration().configure("student.xml").addAnnotatedClass(Student.class);
		SessionFactory sf=con.buildSessionFactory();
		Session s= sf.openSession();
		String name1="Lokeshwaran";
		String name2="Lokesh";
		String name3="Raja";
		String name4="Jeevith";
		
		List<String> names=Arrays.asList("Lokeshwaran","Jeevith","Raja","Lokesh");
		
		Query q= s.createQuery("select s from Student s where s.name IN (:n1)");
		q.setParameter("n1", names);
		List<Student> l=q.getResultList();
		for(Student i: l) {
			System.out.println(i);
		}
		
	}

}
