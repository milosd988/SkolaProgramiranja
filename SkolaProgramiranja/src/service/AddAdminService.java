package service;

import common.CommonMethods;
import dao.AddAdminDao;
import model.Administrator;
import model.User;
import model.UserType;

public class AddAdminService {
	
	AddAdminDao adminDao = new AddAdminDao();
	CommonMethods common = new CommonMethods();

	public User addAdmin(String username, String password, UserType administracija) {

		return common.addAdmin(username, password, administracija);
	}

	public Administrator addAdminDetails(String firstName, String lastName, String email, String phoneNumber,
			String country, String city, String address, User user, String identificationNo) {

		return common.addAdminDetails(firstName, lastName, email, phoneNumber, country, city, address, user, identificationNo);
	}

	public boolean saveAdmin(User user, Administrator admin) {

		return adminDao.saveAdmin(user, admin);
	}

}
