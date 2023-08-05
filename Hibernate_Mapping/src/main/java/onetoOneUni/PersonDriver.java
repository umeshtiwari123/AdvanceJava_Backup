package onetoOneUni;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PersonDriver {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("oneuni");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		PanCard card=new PanCard();
		card.setName("Karthick");
		card.setPannumber("NMBED5938C");
		
		Person person=new Person();
		person.setAge(22);
		person.setGender("Male");
		person.setName("Karthick");
		person.setCard(card);
		
		
		
		
		entityTransaction.begin();
		
		entityManager.persist(card);
		entityManager.persist(person);
		
		
		entityTransaction.commit();
		
		System.out.println("Data is Saved Successfully : ");
	
		
	}
}
