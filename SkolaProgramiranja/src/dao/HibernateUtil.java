package dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	private static SessionFactory sessionFactory = null;
	
	private static SessionFactory createSessionFactory() {
		
		
		return new Configuration().configure().buildSessionFactory();
	}
	
	public static SessionFactory getSessionFactory() {
		
		if(sessionFactory == null) {
			sessionFactory = createSessionFactory();
		}
		
		return sessionFactory;
	}

}
