package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import model.Profesor;
import model.User;

public class AddProfesorDao {
	
	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

	public boolean saveProfessor(User user, Profesor profesor) {
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		try {
			session.save(user);
			session.save(profesor);
			session.getTransaction().commit();
			System.out.println("Professor is in DB!");
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
