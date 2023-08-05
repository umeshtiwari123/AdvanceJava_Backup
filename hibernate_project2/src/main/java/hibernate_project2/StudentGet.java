package hibernate_project2;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class StudentGet {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("stud");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Student Id No : ");
		int identityNumber=scanner.nextInt();
		
		StudentDB student=entityManager.find(StudentDB.class, identityNumber);
		
		System.out.println(student.getIdentityNumber());
		System.out.println(student.getName());
		System.out.println(student.getPhone());
		System.out.println(student.getPincode());
		System.out.println(student.getAddress());
		System.out.println(student.getFatherName());
		System.out.println(student.getMotherName());
		
	}
}
