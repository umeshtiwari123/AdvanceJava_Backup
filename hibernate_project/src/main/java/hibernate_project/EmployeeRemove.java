package hibernate_project;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeRemove {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("emp");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Id: ");
		int id=scanner.nextInt();
		
		EmployeeDB employeeremove=entityManager.find(EmployeeDB.class, id);
		
		entityTransaction.begin();
		
		entityManager.remove(employeeremove);
		
		
		entityTransaction.commit();
		
		System.out.println("Deleted");
	}

}
