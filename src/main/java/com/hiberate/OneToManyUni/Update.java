package com.hiberate.OneToManyUni;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hiberate.OneToManyBi.ClassRoom;

public class Update {
	
	public static void main(String[] args) {
		Configuration con=new Configuration().configure("BusPassenger.xml").addAnnotatedClass(Bus.class).addAnnotatedClass(Passanger.class);
		SessionFactory sf=con.buildSessionFactory();
		Session sc=sf.openSession();
		Transaction tc=sc.beginTransaction();
		
		Bus b1=(Bus)sc.get(Bus.class, 1);
		if(b1!=null) {
			b1.setStart("Koyambadu");
			List< Passanger> p1=b1.getPassenger();
			if(p1!=null) {
				Passanger a1=p1.get(0);
				Passanger a2=p1.get(1);
				Passanger a3=p1.get(2);
				
				a1.setName("preethi");
				a2.setName("Moni");
				a3.setName("Pavi");
				
			}
			sc.update(b1);
			tc.commit();
			sc.close();
			sf.close();
			System.out.println("Data Update");
		}else {
			System.out.println("Id not found");
		}

	}
}
