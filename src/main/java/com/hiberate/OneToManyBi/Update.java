package com.hiberate.OneToManyBi;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Update {

	public static void main(String[] args) {
		
		Configuration con =new Configuration().configure("ClassRoomStudent.xml").addAnnotatedClass(Student.class).addAnnotatedClass(ClassRoom.class);
	    SessionFactory sf=con.buildSessionFactory();
	    Session sc=sf.openSession();
	    Transaction tc=sc.beginTransaction();
	    /*
	    ClassRoom c1=(ClassRoom)sc.get(ClassRoom.class, 1);
	    if(c1!=null) {
	    	c1.setTrainer("Dinesh");
	    	List<Student> s=c1.getS();
	    	if(!s.isEmpty()) {
	    		Student s1=s.get(0);
	    		s1.setSname("Kavya");
	    		s1.setEmail("kavay0810@gmail.com");
	    	}
	    	sc.update(c1);
	    	tc.commit();
	    	sc.close();
	    	sf.close();
	    	System.out.println("Data Update");
	    }else {
	    	System.out.println("Id Not found");
	    }
	    */
	    Student s1=(Student)sc.get(Student.class, 3);
	    if(s1!=null) {
	    	s1.setSname("Kamashi");
	    	s1.setEmail("kamashi0810@gmail.com");
	    	sc.update(s1);
	    	System.out.println("Data Updated");
	    	ClassRoom c1=(ClassRoom)sc.get(ClassRoom.class, 1);
	    	if(c1!=null) {
	    		c1.setSubject("Advance Java");
	    		sc.update(c1);
	    	}
	    	
	    	tc.commit();
	    	sc.close();
	    	sf.close();
	    	System.out.println("Data Updated");
	    }
	}
}
