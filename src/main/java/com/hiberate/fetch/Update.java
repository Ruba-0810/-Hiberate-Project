package com.hiberate.fetch;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Update {
	
	public static void main(String[] args) {
		
		
		Configuration con =new Configuration().configure("student.xml").addAnnotatedClass(Student.class);
		SessionFactory sf=con.buildSessionFactory();
		Session s=sf.openSession();
		Transaction tc= s.beginTransaction();
		Student s1=(Student)s.get(Student.class, 1);
		if(s1!=null) {
			s1.setName("mridhula");
			s1.setMail("mridhula0810@gmail.com");
			s.update(s1);
			s.save(s1);
		    tc.commit();
		    s.close();
		    sf.close();
			System.out.println("Update data");
		}else {
			System.out.println("Id not present");
		}
	}

}
