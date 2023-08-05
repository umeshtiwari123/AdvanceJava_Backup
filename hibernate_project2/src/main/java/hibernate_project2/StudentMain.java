package hibernate_project2;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class StudentMain {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("stud");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Name: ");
		String name=scanner.next();
		System.out.println("Enter the Address : ");
		String address=scanner.next();
		System.out.println("Enter the Phone : ");
		Long phone=scanner.nextLong();
		System.out.println("Enter the PinCode : ");
		Long pincode=scanner.nextLong();
		System.out.println("Enter the Father Name :");
		String fatherName=scanner.next();
		System.out.println("Enter the Mother Name :");
		String motherName=scanner.next();
		
		
		StudentDB studentDB=new StudentDB();
		studentDB.setName(name);
		studentDB.setAddress(address);
		studentDB.setPhone(phone);
		studentDB.setPincode(pincode);
		studentDB.setFatherName(fatherName);
		studentDB.setMotherName(motherName);
		
		
		entityTransaction.begin();
		
		entityManager.persist(studentDB);
		
		entityTransaction.commit();
		
		System.out.println("Insert Operation is Performed Successfully");
	}

}
