package com.hiberate.fetch;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Delete {

	public static void main(String[] args) {
		
		Configuration con=new Configuration().configure("student.xml").addAnnotatedClass(Student.class);
		SessionFactory sf=con.buildSessionFactory();
		Session s=sf.openSession();
		Transaction tc=s.beginTransaction();
		Student s1=(Student)s.get(Student.class, 1);
		if(s1!=null) {
			s.delete(s1);
			tc.commit();
			s.close();
			sf.close();
			System.out.println("Data Deleted");
		}else {
			System.out.println("Id not present");
		}
	}
}
