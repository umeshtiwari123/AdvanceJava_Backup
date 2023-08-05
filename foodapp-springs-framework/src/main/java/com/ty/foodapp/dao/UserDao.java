package com.ty.foodapp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.ty.foodapp.dto.User;
@Component("userdao")
public class UserDao {

	public User saveUser(User user) {
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(Config.class);
		EntityManagerFactory entityManagerFactory = applicationContext.getBean("emf",EntityManagerFactory.class);
		EntityManager entityManager = applicationContext.getBean("em",EntityManager.class);
		EntityTransaction entityTransaction = applicationContext.getBean("et",EntityTransaction.class);
		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();

		return user;
	}

	public User updateUser(User user) {
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(Config.class);
		EntityManagerFactory entityManagerFactory = applicationContext.getBean("emf",EntityManagerFactory.class);
		EntityManager entityManager = applicationContext.getBean("em",EntityManager.class);
		EntityTransaction entityTransaction = applicationContext.getBean("et",EntityTransaction.class);
		entityTransaction.begin();
		entityManager.merge(user);
		entityTransaction.commit();

		return user;
	}

	public boolean deleteUser(int id) {
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(Config.class);
		EntityManagerFactory entityManagerFactory = applicationContext.getBean("emf",EntityManagerFactory.class);
		EntityManager entityManager = applicationContext.getBean("em",EntityManager.class);
		EntityTransaction entityTransaction = applicationContext.getBean("et",EntityTransaction.class);
		User user = entityManager.find(User.class, id);
		if (user != null) {
			entityTransaction.begin();
			entityManager.remove(user);
			entityTransaction.commit();
			return true;
		} else {
			return false;
		}

	}

	public User findUserById(int id) {
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(Config.class);
		EntityManagerFactory entityManagerFactory = applicationContext.getBean("emf",EntityManagerFactory.class);
		EntityManager entityManager = applicationContext.getBean("em",EntityManager.class);
		User user = entityManager.find(User.class, id);
		if (user != null) {
			return user;
		} else {
			return null;
		}

	}

	public User findUserByEmail(String email) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("foodapp");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Query query = entityManager.createQuery("Select s from User s where s.email=?1");
		User user = (User) query.setParameter(1, email).getSingleResult();
		return user;
	}

}
