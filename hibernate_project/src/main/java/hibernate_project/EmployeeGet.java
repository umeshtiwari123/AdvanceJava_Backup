package hibernate_project;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmployeeGet {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("emp");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Id: ");
		int id=scanner.nextInt();

		
		EmployeeDB employee=entityManager.find(EmployeeDB.class, id);
		
		System.out.println(employee.getId());
		System.out.println(employee.getName());
		System.out.println(employee.getPhone());
	}

}
