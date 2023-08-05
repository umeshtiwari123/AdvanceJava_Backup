package hibernate_project;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeMain {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("emp");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Id: ");
		int id=scanner.nextInt();
		System.out.println("Enter the Name: ");
		String name=scanner.next();
		System.out.println("Enter the Phone : ");
		Long phone=scanner.nextLong();
		
		EmployeeDB employeedb=new EmployeeDB();
		employeedb.setId(id);
		employeedb.setName(name);
		employeedb.setPhone(phone);
		
		entityTransaction.begin();
		
		entityManager.persist(employeedb);
		
		entityTransaction.commit();
	}

}
