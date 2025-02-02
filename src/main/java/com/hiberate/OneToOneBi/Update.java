package com.hiberate.OneToOneBi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Update {
	public static void main(String[] args) {
		
		Configuration con= new Configuration().configure("key.xml").addAnnotatedClass(Key.class).addAnnotatedClass(Cupboard.class);
		 SessionFactory sf=con.buildSessionFactory();
		 Session s=sf.openSession();
		 Transaction tc=s.beginTransaction();
		 
		 Key k1=(Key)s.get(Key.class, 1);
		 if(k1!=null) {
			 k1.setKname("ABC Key");
			 Cupboard c=k1.getCupboard();
			 c.setCupboardtype("Neem tree");
			 s.update(k1);
			 
			 System.out.println("Data update");
		 }else {
			 System.out.println("Id not found");
		 }
		 
		 Cupboard c1=(Cupboard)s.get(Cupboard.class, 4);
		 if(c1!=null) {
			c1.setCupboardtype("BVC");
			Key k2= c1.getKey();
			k2.setKname("OP Key");
			
			s.update(c1);
			tc.commit();
			s.close();
			sf.close();
			
			System.out.println("Data Update");
		 }else {
			 System.out.println("Id Not Update");
		 }
	}

}
