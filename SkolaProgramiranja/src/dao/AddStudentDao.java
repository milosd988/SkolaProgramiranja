package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import model.Student;
import model.User;
import model.UserDetails;

public class AddStudentDao {
	
	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

	public boolean addStudents(User user, UserDetails details, Student student) {

		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		
		try {
			
			session.save(user);
			session.save(details);
			session.save(student);
			
			session.getTransaction().commit();
			System.out.println("Student is in DB!");
			return true;
			
		} catch (Exception e) {
			session.getTransaction().rollback();
			System.out.println("Something went wrong here!" + e);
			return false;
		} finally {
			
			session.close();
			
		}
		
		
	}
	
	

}
