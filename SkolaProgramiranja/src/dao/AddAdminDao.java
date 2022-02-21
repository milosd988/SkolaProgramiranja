package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



import model.Administrator;
import model.User;

public class AddAdminDao {
	
	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	
	

	public boolean saveAdmin(User user, Administrator admin) {

		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		try {
			session.save(user);
			session.save(admin);
			session.getTransaction().commit();
			System.out.println("Admin is in DB!");
			return true;
		} catch (Exception e) {
			session.getTransaction().rollback();
			System.out.println("Something went wrong!" + e);
			return false;
		} finally {
			session.close();
		}
		
	}

}
