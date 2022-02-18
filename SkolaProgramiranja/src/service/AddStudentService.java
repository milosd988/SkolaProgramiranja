package service;

import common.CommonMethods;
import dao.AddStudentDao;
import model.Student;
import model.User;
import model.UserDetails;
import model.UserType;

public class AddStudentService {
	
	AddStudentDao studentDao = new AddStudentDao();
	CommonMethods commonMethods = new CommonMethods();
	
	
	public User addStudent(String username, String password, UserType userType) {

		return commonMethods.addStudent(username, password, userType);
	}


	public UserDetails addStudentDetails(String firstName, String lastName, String email, String phoneNumber,
			String country, String city, String address, User user) {

		
		return commonMethods.addStudentSetails(firstName, lastName, email, phoneNumber, country, city, address, user);
	}


	public boolean addStudents(User user, UserDetails details, Student student) {

		return studentDao.addStudents(user, details, student);
	}

}
