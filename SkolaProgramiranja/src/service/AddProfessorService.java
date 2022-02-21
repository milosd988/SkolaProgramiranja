package service;

import common.CommonMethods;
import dao.AddProfesorDao;
import model.Profesor;
import model.User;
import model.UserType;

public class AddProfessorService {
	
	AddProfesorDao professorDao = new AddProfesorDao();
	CommonMethods common = new CommonMethods();

	public User addProfessor(String username, String password, UserType profesor) {

		return common.addProfessor(username, password, profesor);
	}

	public Profesor addProfessorDetails(String firstName, String lastName, String email, String phoneNumber,
			String country, String city, String address, User user, String identificationNo) {

		return common.addProfessorDetails(firstName, lastName, email, phoneNumber, country, city, address, user, identificationNo);
	}

	public boolean saveProfessor(User user, Profesor profesor) {

		return professorDao.saveProfessor(user, profesor);
	}

}
