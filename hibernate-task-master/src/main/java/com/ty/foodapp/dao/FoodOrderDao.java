package com.ty.foodapp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.foodapp.dto.FoodOrder;
import com.ty.foodapp.dto.Menu;

public class FoodOrderDao {
	
	public FoodOrder saveMenu(FoodOrder foodOrder) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("foodapp");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(foodOrder);
		entityTransaction.commit();

		return foodOrder;
	}

}

