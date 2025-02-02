package com.hiberate.OneToManyBi;


import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Driver {
	
	public static void main(String[] args) {
		
		ClassRoom c1=new ClassRoom();
		c1.setSubject("SQL");
		c1.setTrainer("Indhuja");
		
		Student s1=new Student();
		s1.setSname("Rakesh");
		s1.setEmail("rakesh0810@gmail.com");
		s1.setClassroom(c1);
		Student s2=new Student();
		s2.setSname("Praneet");
		s2.setEmail("Praneet0810@gmail.com");
		s2.setClassroom(c1);
		Student s3=new Student();
		s3.setSname("Nivas");
		s3.setEmail("nivas0810@gmail.com");
		s3.setClassroom(c1);
		
		ArrayList<Student> list=new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		c1.setS(list);
		
		Configuration con =new Configuration().configure("ClassRoomStudent.xml").addAnnotatedClass(Student.class).addAnnotatedClass(ClassRoom.class);
	    SessionFactory sf=con.buildSessionFactory();
	    Session sc=sf.openSession();
	    Transaction tc=sc.beginTransaction();
	    sc.save(c1);
	    sc.save(s1);
	    sc.save(s2);
	    sc.save(s3);
	    tc.commit();
	    sc.close();
	    sf.close();
	    System.out.println("Data Saved");
	}

}
