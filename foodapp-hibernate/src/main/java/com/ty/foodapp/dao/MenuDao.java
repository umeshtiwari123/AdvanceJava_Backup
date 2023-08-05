package com.ty.foodapp.dao;

import com.ty.foodapp.dto.Menu;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MenuDao {


	public Menu saveMenu(Menu menu) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("foodapp");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(menu);
		entityTransaction.commit();

		return menu;
	}

	public Menu updateMenu(Menu menu) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("foodapp");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.merge(menu);
		entityTransaction.commit();

		return menu;
	}

	public boolean deleteMenu(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("foodapp");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Menu menu = entityManager.find(Menu.class, id);
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.remove(menu);
		entityTransaction.commit();

		return true;
	}
	
	public Menu getMenuById(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("foodapp");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		return entityManager.find(Menu.class, id);
	}
	
}
