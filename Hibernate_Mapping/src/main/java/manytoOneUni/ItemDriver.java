package manytoOneUni;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ItemDriver {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("oneuni");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Carts cart=new Carts();
		cart.setName("Rajesh");
		cart.setEmail("r@gmail.com");
		cart.setAddress("CHN");
		
		Items i1=new Items();
		i1.setName("Duster");
		i1.setPrice(50);
		i1.setManufacturer("Camlin");
		i1.setC(cart);
		
		
		Items i2=new Items();
		i2.setName("Pen");
		i2.setPrice(200);
		i2.setManufacturer("Reynolds");
		i2.setC(cart);
		
		
		
		
		entityTransaction.begin();
		
		entityManager.persist(cart);
		entityManager.persist(i1);
		entityManager.persist(i2);
		
		entityTransaction.commit();
		
	}

}
