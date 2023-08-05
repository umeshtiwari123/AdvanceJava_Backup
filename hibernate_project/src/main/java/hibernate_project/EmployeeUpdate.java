package hibernate_project;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeUpdate {

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
		
		EmployeeDB employeeUpdate=new EmployeeDB();
		employeeUpdate.setId(id);
		employeeUpdate.setName(name);
		employeeUpdate.setPhone(phone);
		
		entityTransaction.begin();
		
		entityManager.merge(employeeUpdate);
		
		entityTransaction.commit();
	}

	

}
