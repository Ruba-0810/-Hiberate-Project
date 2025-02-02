package com.hiberate.OneToOneBi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hiberate.OneToOneUni.Person;
import com.hiberate.OneToOneUni.Vote;

public class Driver {
	public static void main(String[] args) {
		
		Key k =new Key();
		k.setKname("rsf key");
		Cupboard c=new Cupboard();
		c.setCupboardtype("Rubber");
		k.setCupboard(c);
		c.setKey(k);
		

		 Configuration con= new Configuration().configure("key.xml").addAnnotatedClass(Key.class).addAnnotatedClass(Cupboard.class);
		 SessionFactory sf=con.buildSessionFactory();
		 Session s=sf.openSession();
		 Transaction tc=s.beginTransaction();
		 s.save(k);
		 s.save(c);
		 tc.commit();
		 s.close();
		 sf.close();
		 System.out.println("Data saved");
		 
	}

}
