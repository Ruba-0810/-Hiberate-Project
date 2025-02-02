package com.hiberate.ManyToOneBi;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Driver {

    public static void main(String[] args) {
        
        Shop h1 = new Shop();
        h1.setStopname("PG");
        h1.setStopAddress("Vadapalani");

        
        Product p1 = new Product();
        p1.setProductname("Mobile");
        p1.setTotalcount(10);
        p1.setShop(h1);

        Product p2 = new Product();
        p2.setProductname("Laptop");
        p2.setTotalcount(5);
        p2.setShop(h1);

        Product p3 = new Product();
        p3.setProductname("Computer");
        p3.setTotalcount(10);
        p3.setShop(h1);

        // Add Products to Shop's Product list
        List<Product> products = new ArrayList<>();
        products.add(p1);
        products.add(p2);
        products.add(p3);
        h1.setProduct(products);

        // Hibernate configuration
        Configuration con = new Configuration().configure("ShopProduct.xml")
                .addAnnotatedClass(Shop.class)
                .addAnnotatedClass(Product.class);

        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();

        // Save entities to database
        session.save(h1);  // This will cascade save the products as well
        session.save(p1);
        session.save(p2);
        session.save(p3);

        transaction.commit();
        session.close();
        sf.close();

        System.out.println("Data Saved Successfully");
    }
}
