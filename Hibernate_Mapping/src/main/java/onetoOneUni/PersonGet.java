package onetoOneUni;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersonGet {
//Program to retrieve the value
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("oneuni");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		
		
		PanCard pancard=entityManager.find(PanCard.class, 1);
		
		System.out.println(pancard);
		
		
//		Person person=entityManager.find(Person.class, 1);
//		
//		System.out.println(person);
	}

}
