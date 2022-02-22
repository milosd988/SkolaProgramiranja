package dao;


import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



import model.User;
import model.UserDetails;


public class LoginDao {
	
	SessionFactory sf = HibernateUtil.getSessionFactory();
	
	public void upisiUsera(User user, UserDetails details) {
		
		Session session = sf.openSession();
		
		session.beginTransaction();
		
		try {
			
			session.save(user);
			session.save(details);
			
			session.getTransaction().commit();
			System.out.println("Uspesno upisan user!");
			
		} catch (Exception e) {
			session.getTransaction().rollback();
			System.out.println("User nije upisan u bazu!" + e);
		} finally {
			
			session.close();
			
		}
	}

	public User daLiPostojiUser(String userName, String password) {

		User user = new User();
		
		Session session = sf.openSession();
		
		session.beginTransaction();
		
		try {
			String sql = "from User where userName = :un and password = :pass";
			Query query = session.createQuery(sql);
			query.setParameter("un", userName);
			query.setParameter("pass", password);
			
			List<User> users = query.getResultList();
			if(users.size() == 1) {
				
				System.out.println("Postoji user u bazi!");
				user = users.get(0);
				session.getTransaction().commit();
				return user;
				
			}
			else {
				System.out.println("Ne postoji user!");
				session.getTransaction().commit();
				return null;
			}
			
			
			
			
		} catch (Exception e) {
			session.getTransaction().rollback();
			System.out.println("Problem u metodi!" + e);
			return null;
		} finally {
			session.close();
		}
		
	}

}
