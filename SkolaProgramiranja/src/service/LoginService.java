package service;

import common.Validacija;
import dao.LoginDao;
import model.User;
import model.UserDetails;

public class LoginService {
	
	LoginDao loginDao = new LoginDao();
	Validacija validacija = new Validacija();
	
	
	public void upisiUsera(User user, UserDetails details) {
		
		loginDao.upisiUsera(user, details);
		
	}

}
