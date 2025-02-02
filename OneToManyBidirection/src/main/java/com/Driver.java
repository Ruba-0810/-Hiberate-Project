package com;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Driver {
	
	
	public static void main(String[] args) {
		
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction tc=em.getTransaction();
	    
		Batch b=new Batch();
        b.setSubject("SQL");
        b.setTrainer("Keerthana");
        b.setTiming("10.00am");
        b.setRoomno(302);
        b.setNoofstudent(100);
        
        Student s1=new Student();
        s1.setName("Ruba");
        s1.setEmail("ruba0810@gmail.com");
        s1.setGender("Female");
        s1.setPhone(123455678);
        s1.setBatch(b);
        
        Student s2=new Student();
        s2.setName("Thiru");
        s2.setEmail("thiru0810@gmail.com");
        s2.setGender("male");
        s2.setPhone(987654556);
        s2.setBatch(b);
        
        Student s3=new Student();
        s3.setName("Jeevith");
        s3.setEmail("jeevith0810@gmail.com");
        s3.setGender("male");
        s3.setPhone(76979884);
        s3.setBatch(b);
        
        Student s4=new Student();
        s4.setName("Pavi");
        s4.setEmail("pavi0810@gmail.com");
        s4.setGender("Female");
        s4.setPhone(89809898);
        s4.setBatch(b);
        
        List<Student> list=new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        
        b.setStudents(list);
        
        tc.begin();
        em.persist(b);
        tc.commit();
        
        System.out.println("Data saved");
        
	}

}
