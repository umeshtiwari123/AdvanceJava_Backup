package com.ty.Student.EB8.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.Student.EB8.dto.Student;

public class StudentDao {

	public void saveStudent(Student student) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("umesh");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();

		entityManager.persist(student);

		entityTransaction.commit();

	}

	public Student getStudentByEmail(String name) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("umesh");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Query query = entityManager.createQuery("Select s from Student s where s.name=?1", Student.class);
		System.out.println("hiii");
		Student std = (Student) query.setParameter(1, name).getSingleResult();
		System.out.println("hiii");
		return std;
	}
}
