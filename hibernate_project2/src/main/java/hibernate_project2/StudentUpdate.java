package hibernate_project2;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class StudentUpdate {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("stud");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Id :");
		int identityNumber=scanner.nextInt();
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
		
		StudentDB studentUpdate=new StudentDB();
		studentUpdate.setIdentityNumber(identityNumber);
		studentUpdate.setName(name);
		studentUpdate.setAddress(address);
		studentUpdate.setPhone(phone);
		studentUpdate.setPincode(pincode);
		studentUpdate.setFatherName(fatherName);
		studentUpdate.setMotherName(motherName);
		
		
		
		entityTransaction.begin();
		
		entityManager.merge(studentUpdate);
		
		entityTransaction.commit();
	}

}
