package com.hiberate.OneToManyUni;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Delete {
	
	public static void main(String[] args) {
		
		Configuration con=new Configuration().configure("BusPassenger.xml").addAnnotatedClass(Bus.class).addAnnotatedClass(Passanger.class);
		SessionFactory sf=con.buildSessionFactory();
		Session sc=sf.openSession();
		Transaction tc=sc.beginTransaction();
		

		Bus b2=(Bus)sc.get(Bus.class, 4);
		if(b2!=null) {
			List<Passanger> i=b2.getPassenger();
			if(i!=null) {
				Passanger a=i.get(1);
				i.remove(a);
				sc.delete(a);
				tc.commit();
				sc.close();
				sf.close();
				System.out.println("Data Deleted");
			}else {
				System.out.println("Id not present in passanger");
			}
			
		}else {
			System.out.println("Id not present in Bus");
		}
		

	}

}
