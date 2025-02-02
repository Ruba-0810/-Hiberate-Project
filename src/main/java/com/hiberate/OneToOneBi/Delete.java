package com.hiberate.OneToOneBi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Delete {
	
	public static void main(String[] args) {
		
		

		Configuration con= new Configuration().configure("key.xml").addAnnotatedClass(Key.class).addAnnotatedClass(Cupboard.class);
		 SessionFactory sf=con.buildSessionFactory();
		 Session s=sf.openSession();
		 Transaction tc=s.beginTransaction();
		 //parent
//		 Cupboard c1=(Cupboard)s.get(Cupboard.class, 6);
//		 if(c1!=null) {
//			 s.delete(c1);
//			 tc.commit();
//			 s.close();
//			 sf.close();
//			 System.out.println("Data Delete");
//		 }else {
//			 System.out.println("Id not found");
//		 }
		 Key k=(Key)s.get(Key.class, 5);
		 if(k!=null) {
			 Cupboard c= k.getCupboard();
			 if(c!=null) {
				 //s.delete(c);
				 s.delete(k);
			 }
			 tc.commit();
			 s.close();
			 sf.close();
			 System.out.println("Data Delete");
		 }else {
			 System.out.println("Id not found");
		 }
		 
		 
	}

}
