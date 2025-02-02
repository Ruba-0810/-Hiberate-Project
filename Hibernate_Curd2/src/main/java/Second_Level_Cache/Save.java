package Second_Level_Cache;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Save {
	
public static void main(String[] args) {
		
		
		Employee e= new Employee();
		e.setId(6);
		e.setName("Rakesh");
		e.setEmail("rakesh@gmail.com");
		e.setSal(3500);
		e.setPhone(98765434);
				
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.persist(e);
		et.commit();
		
		System.out.println("Data Saved");
		
		
	}

}
