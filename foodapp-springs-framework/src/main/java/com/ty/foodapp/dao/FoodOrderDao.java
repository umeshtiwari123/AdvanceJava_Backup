package com.ty.foodapp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.ty.foodapp.dto.FoodOrder;

@Component(value="foodorderdao")
public class FoodOrderDao {

	public FoodOrder saveMenu(FoodOrder foodOrder) {
		ApplicationContext applicationContext =new AnnotationConfigApplicationContext(Config.class);
		EntityManagerFactory entityManagerFactory = applicationContext.getBean("emf",EntityManagerFactory.class);
		EntityManager entityManager = applicationContext.getBean("em",EntityManager.class);
		EntityTransaction entityTransaction = applicationContext.getBean("et",EntityTransaction.class);
		entityTransaction.begin();
		entityManager.persist(foodOrder);
		entityTransaction.commit();

		return foodOrder;
	}
}
