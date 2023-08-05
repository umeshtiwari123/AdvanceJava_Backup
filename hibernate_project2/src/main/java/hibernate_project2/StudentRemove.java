package hibernate_project2;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentRemove {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("stud");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Student Id to Remove");
		int identityNumber=scanner.nextInt();
		
		StudentDB studentremove=entityManager.find(StudentDB.class, identityNumber);
		
		entityTransaction.begin();
		
		entityManager.remove(studentremove);
		
		
		entityTransaction.commit();
		
		System.out.println(" Student is Removed Successfully ");
		
	}
}
