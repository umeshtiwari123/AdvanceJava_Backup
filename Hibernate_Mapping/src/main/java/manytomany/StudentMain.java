package manytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentMain {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("oneuni");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Course course1=new Course();
		course1.setName("Java");
		
		Course course2=new Course();
		course2.setName("Advance Java");
		
		Course course3=new Course();
		course3.setName("HTML");
		
		Student student1=new Student();
		student1.setName("Vinod");
		student1.setPhone(789);
		
		Student student2=new Student();
		student2.setName("Priya");
		student2.setPhone(123);
		
		Student student3=new Student();
		student3.setName("Raju");
		student3.setPhone(667);
		
		List<Course> list1=new ArrayList<Course>();
		list1.add(course1);
		list1.add(course3);
		
		List<Course> list2=new ArrayList<Course>();
		list2.add(course2);
		list2.add(course3);
		
		student1.setCourses(list1);	
		student2.setCourses(list2);
		
		
		
		
		
//		List<Course> list2=new ArrayList<Course>();
//		list2.add(course3);
//		list2.add(course1);
		
		//student2.setCourses(list2);
		
		entityTransaction.begin();
		
		entityManager.persist(course1);
		entityManager.persist(course2);
		entityManager.persist(course3);
		entityManager.persist(student1);
		entityManager.persist(student2);
		entityManager.persist(student3);
		
		
		entityTransaction.commit();
		
		
		
	}

}
