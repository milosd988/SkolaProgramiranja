package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import model.Predmet;
import model.Smer;

public class AddPredmetSmerDao {
	
	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	public boolean savePredmet(Predmet predmet) {

		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		try {
			session.save(predmet);
			session.getTransaction().commit();
			System.out.println("Predmet is in DB!");
			return true;
		} catch (Exception e) {
			session.getTransaction().rollback();
			System.out.println("Something went wrong!" + e);
			return false;
		} finally {
			session.close();
		}
		
	}

	public boolean saveSmer(Smer smer) {

		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		try {
			session.save(smer);
			session.getTransaction().commit();
			System.out.println("Smer is in DB!");
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
