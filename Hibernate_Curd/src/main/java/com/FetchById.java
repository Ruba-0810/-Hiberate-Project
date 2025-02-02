package com;
import java.util.Scanner;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class FetchById {
	
		public static void main(String[] args){           //--------->find() method
		
			EntityManagerFactory emf =Persistence.createEntityManagerFactory("dev");
			EntityManager em= emf.createEntityManager();
			
			Scanner s = new Scanner(System.in);
			System.out.println("Enter id");
			int id = s.nextInt();
			
			Employee e= em.find(Employee.class,id);
			
			if(e!=null)   {
				System.out.println(e);
			} else {
				System.out.println("Id not found"); 
				
				
				
			}
			}
		}

