 package com.hiberate.Part1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AlienName newName=new  AlienName();
    	newName.setFname("ram");
    	newName.setLname("M");
    	
        Alien  tel=new Alien();
//        tel.setId(1);
//        tel.setColor("Red");
//        tel.setId(7);
//        tel.setFname("Vishwa");
//        tel.setColor("Yellow");
        
        
        Configuration con =new Configuration().configure("alien.cfg.xml").addAnnotatedClass(Alien.class);//which class making entrty it should be return 
        
        SessionFactory sf= con.buildSessionFactory();//interface
        Session session =sf.openSession();// interface
        Transaction tx=session.beginTransaction(); //to transform data into db
        
       // tel=(Alien)session.get(Alien.class, 1);//to fetch data from database 
       // session.save(tel);//---->for save
        tx.commit();
        System.out.println(tel);
    }
}
