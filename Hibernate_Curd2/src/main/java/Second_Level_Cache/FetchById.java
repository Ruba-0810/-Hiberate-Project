package Second_Level_Cache;
import java.util.Scanner;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class FetchById {
	
		public static void main(String[] args){           //--------->find() method
		
			EntityManagerFactory emf =Persistence.createEntityManagerFactory("dev");
			EntityManager em1= emf.createEntityManager();
			EntityManager em2= emf.createEntityManager();
			
		     //Second-Level Cache
			em1.find(Employee.class, 1);
			em1.find(Employee.class, 2);
			em2.find(Employee.class, 1);
			em2.find(Employee.class, 2);
			em1.find(Employee.class, 1);
			em1.find(Employee.class, 2);
			em2.find(Employee.class, 1);
			em2.find(Employee.class, 2);
			}
		}

