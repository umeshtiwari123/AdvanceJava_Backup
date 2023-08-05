package onetoManyUni;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CartDriver {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("oneuni");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		//1st Item
		Item item1=new Item();
		item1.setName("Book");
		item1.setPrice(50);
		item1.setManufacturer("ClassMate");
		
		Item item3=new Item();
		item3.setName("PenDrive");
		item3.setPrice(400);
		item3.setManufacturer("HP");
		
		//2nd Item
		Item item2=new Item();
		item2.setName("Laptop");
		item2.setPrice(5000);
		item2.setManufacturer("Dell");
		
		//Cart
		
		Cart cart=new Cart();
		cart.setName("Dimple");
		cart.setEmail("Dimple@gmail.com");
		cart.setAddress("BLR");
		
		List<Item> items=new ArrayList();
		items.add(item1);
		items.add(item2);
		
		cart.setItems(items);
		
		entityTransaction.begin();
		
		entityManager.persist(item1);
		entityManager.persist(item2);
		entityManager.persist(item3);
		entityManager.persist(cart);
		
		
		entityTransaction.commit();
		
		
		
		
		
		
	}

}
