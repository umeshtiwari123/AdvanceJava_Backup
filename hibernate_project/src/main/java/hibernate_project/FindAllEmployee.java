package hibernate_project;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindAllEmployee {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("emp");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("Select a from EmployeeDB a");
		
		List<EmployeeDB> employees=query.getResultList();
		
		for(EmployeeDB employee :employees)
		{
			System.out.println(employee);
		}
	}

}
