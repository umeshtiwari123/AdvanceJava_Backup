package hibernate_project2;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindAllStudent {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("stud");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("Select a from StudentDB a");

		List<StudentDB> students=query.getResultList();
		
		for(StudentDB student : students)
		{
			System.out.println(student);
		}
		
	}

}
