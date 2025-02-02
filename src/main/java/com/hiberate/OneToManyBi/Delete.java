package com.hiberate.OneToManyBi;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Delete {
	
	public static void main(String[] args) {
		
		
		Configuration con =new Configuration().configure("ClassRoomStudent.xml").addAnnotatedClass(Student.class).addAnnotatedClass(ClassRoom.class);
	    SessionFactory sf=con.buildSessionFactory();
	    Session sc=sf.openSession();
	    Transaction tc=sc.beginTransaction();
	    
//	    ClassRoom c1=(ClassRoom)sc.get(ClassRoom.class, 4);
//	    if(c1!=null) {
//	       List<Student> l=c1.getS();
//	       Student i=l.get(0);
//	       l.remove(i);
//	       sc.delete(i);
//	       tc.commit();
//	       sc.close();
//	       sc.close();
//	       System.out.println("Data delete");
//	    }else {
//	    	System.out.println("Id Not present");
//	    }
	    Student s1=(Student)sc.get(Student.class,12);
	    if(s1!=null) {
	    	if(s1.getClassroom()!=null) {
	    		ClassRoom c=s1.getClassroom();
	    		List<Student> students=c.getS();
	    		students.remove(s1);
	    		s1.setClassroom(null);
//	    		sc.update(c);
//	    		sc.update(s1);
		    	
	    	}
	 
	    	 sc.delete(s1);
	    	 
	    	 //if (tc.isActive()) {  
	                tc.commit();  // Ensure the transaction is active before committing
	          //  }else {
	            	
	            System.out.println("Data Deleted");
	       // } 
	    	
	    }else {
	    	System.out.println("Id Not present");
	    }
	    sc.close();
        sf.close();
	    
	}

}
