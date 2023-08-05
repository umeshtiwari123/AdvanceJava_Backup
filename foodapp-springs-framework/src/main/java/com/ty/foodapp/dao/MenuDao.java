package com.ty.foodapp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.ty.foodapp.dto.Menu;

@Component(value="menudao")
public class MenuDao {


	public Menu saveMenu(Menu menu) {
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(Config.class);
		EntityManagerFactory entityManagerFactory = applicationContext.getBean("emf",EntityManagerFactory.class);
		EntityManager entityManager = applicationContext.getBean("em",EntityManager.class);
		EntityTransaction entityTransaction = applicationContext.getBean("et",EntityTransaction.class);
		entityTransaction.begin();
		entityManager.persist(menu);
		entityTransaction.commit();

		return menu;
	}

	public Menu updateMenu(Menu menu) {
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(Config.class);
		EntityManagerFactory entityManagerFactory = applicationContext.getBean("emf",EntityManagerFactory.class);
		EntityManager entityManager = applicationContext.getBean("em",EntityManager.class);
		EntityTransaction entityTransaction = applicationContext.getBean("et",EntityTransaction.class);
		entityTransaction.begin();
		entityManager.merge(menu);
		entityTransaction.commit();

		return menu;
	}

	public boolean deleteMenu(int id) {
		
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(Config.class);
		EntityManagerFactory entityManagerFactory = applicationContext.getBean("emf",EntityManagerFactory.class);
		EntityManager entityManager = applicationContext.getBean("em",EntityManager.class);
		Menu menu = entityManager.find(Menu.class, id);
		EntityTransaction entityTransaction = applicationContext.getBean("et",EntityTransaction.class);
		entityTransaction.begin();
		entityManager.remove(menu);
		entityTransaction.commit();

		return true;
	}
	
	public Menu getMenuById(int id) {
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(Config.class);
		EntityManagerFactory entityManagerFactory = applicationContext.getBean("emf",EntityManagerFactory.class);
		EntityManager entityManager = applicationContext.getBean("em",EntityManager.class);
		return entityManager.find(Menu.class, id);
	}
	
}
