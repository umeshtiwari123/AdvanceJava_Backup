package hibernate_project;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeMain2 {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("emp");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the Name : ");
		String name=scanner.next();
		System.out.println("Enter the Phone : ");
		Long phone=scanner.nextLong();
		
		EmployeeDB e=new EmployeeDB();
		e.setName(name);
		e.setPhone(phone);
		
		entityTransaction.begin();
		
		
		entityManager.persist(e);
		entityTransaction.commit();
		
	}

}
