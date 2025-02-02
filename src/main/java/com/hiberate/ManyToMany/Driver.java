package com.hiberate.ManyToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Driver {
	
public static void main(String[] args) {
		
		Course c1=new Course();
		c1.setCoursename("DSA");
		
		Course c2=new Course();
		c1.setCoursename("Java");
		
		Course c3=new Course();
		c1.setCoursename("C++");
		
		
		Student s1=new Student();
		s1.setFname("Raj");
		s1.setLname("Kumar");
		

		Student s2=new Student();
		s2.setFname("Shree");
		s2.setLname("sri");

		Student s3=new Student();
		s3.setFname("Vishwa");
		s3.setLname("K");
		
		List<Course> list1=new ArrayList<>();
	    list1.add(c1);
	    list1.add(c2);
	    list1.add(c3);
	    
	    s1.setCourse(list1);
	    s2.setCourse(list1);
	    s3.setCourse(list1);
	    
	    List<Student> list2=new ArrayList<>();
	    
	    list2.add(s1);
	    list2.add(s2);
	    list2.add(s3);
	    
	     c1.setS(list2);
	     c2.setS(list2);
	     c3.setS(list2);
	    
		
		
		
		
		
		
		
		Configuration con =new Configuration().configure("CourseStudent.xml").addAnnotatedClass(Course.class).addAnnotatedClass(Student.class);
		SessionFactory sf=con.buildSessionFactory();
		Session s=sf.openSession();
		Transaction tc=s.beginTransaction();
	    s.save(c1);
	    s.save(c2);
	    s.save(c3);
	    s.save(s1);
	    s.save(s2);
	    s.save(s3);
		tc.commit();
		s.close();
		sf.close();
		System.out.println("Data Saved");
		
		
	}

}
