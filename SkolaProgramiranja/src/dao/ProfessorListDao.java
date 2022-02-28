package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import model.Predmet;
import model.Profesor;
import model.ProfesorList;

public class ProfessorListDao {
	
	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	public List<ProfesorList> getProfessorList() {
		
		List<ProfesorList> professorList = new ArrayList<>();
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		try {
			String sql = "select ud.idUserDetails,\r\n"
					+ "u.username,\r\n"
					+ "u.password, \r\n"
					+ "ud.firstName,\r\n"
					+ "ud.lastName,\r\n"
					+ "ud.email,\r\n"
					+ "ud.phoneNumber,\r\n"
					+ "ud.country,\r\n"
					+ "ud.city,\r\n"
					+ "ud.street,\r\n"
					+ "p.identificationNo\r\n"
					+ "from user u \r\n"
					+ "inner join userdetails ud on ud.user_idUser = u.idUser\r\n"
					+ "inner join profesor p on p.idUserDetails = ud.idUserDetails";
			
			Query query = session.createNativeQuery(sql);
			List<Object[]> resultList = query.getResultList();
			
			for(Object[] o : resultList) {
				ProfesorList profesor = new ProfesorList();
				
				if(o[0] != null) {profesor.setIdProfesor((int)o[0]);}
				if(o[1] != null) {profesor.setUserName((String)o[1]);}
				if(o[2] != null) {profesor.setPassword((String)o[2]);}
				if(o[3] != null) {profesor.setFirstName((String)o[3]);}
				if(o[4] != null) {profesor.setLastName((String)o[4]);}
				if(o[5] != null) {profesor.setEmail((String)o[5]);}
				if(o[6] != null) {profesor.setPhoneNumber((String)o[6]);}
				if(o[7] != null) {profesor.setCountry((String)o[7]);}
				if(o[8] != null) {profesor.setCity((String)o[8]);}
				if(o[9] != null) {profesor.setAddress((String)o[9]);}
				if(o[10] != null) {profesor.setIdNumber((String)o[10]);}
				
				professorList.add(profesor);
			}
			
			
			session.getTransaction().commit();
			return professorList;
		} catch (Exception e) {
			System.out.println("Something went wrong!!!" + e);
			return null;
		} finally {
			session.close();
		}

		
	}

	public List<Predmet> getPredmet() {
		
		List<Predmet> predmeti = new ArrayList<>();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		try {
			String sql = "from Predmet";
			
			Query query = session.createQuery(sql);
			List<Predmet> resultList = query.getResultList();
			
			
			session.getTransaction().commit();
			return predmeti;
		} catch (Exception e) {
			System.out.println("Something went wrong!!!" + e);
			return null;
		} finally {
			session.close();
		}
	}

	public Profesor getProfesorId(String idProfesor) {
		
		Profesor profesor = new Profesor();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		try {
			
			profesor = session.get(Profesor.class, Integer.parseInt(idProfesor));
			Hibernate.initialize(profesor.getPredmetiNaKojimaPredaje());
			session.getTransaction().commit();
			return profesor;
		} catch (Exception e) {
			System.out.println("Something went wrong!!!" + e);
			return null;
		} finally {
			session.close();
		}
	}

}
