package common;

import model.Address;
import model.Administrator;
import model.Contact;
import model.Predmet;
import model.Profesor;
import model.Smer;
import model.User;
import model.UserDetails;
import model.UserType;

public class CommonMethods {

	public User addStudent(String username, String password, UserType userType) {

		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setUserType(userType);
		
		return user;
	}

	public UserDetails addStudentSetails(String firstName, String lastName, String email, String phoneNumber,
			String country, String city, String address, User user) {

		UserDetails details = new UserDetails();
		Address addressDetails = new Address();
		Contact contact = new Contact();
		
		addressDetails.setCountry(country);
		addressDetails.setCity(city);
		addressDetails.setStreet(address);
		
		contact.setEmail(email);
		contact.setPhoneNumber(phoneNumber);
		
		details.setFirstName(firstName);
		details.setLastName(lastName);
		details.setUser(user);
		details.setAddress(addressDetails);
		details.setContact(contact);
		
		
		
		return details;
	}

	public User addProfessor(String username, String password, UserType profesor) {

		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setUserType(profesor);
		
		return user;
		
	}

	public Profesor addProfessorDetails(String firstName, String lastName, String email, String phoneNumber,
			String country, String city, String address, User user, String identificationNo) {
		
		Profesor profesor = new Profesor();
		Address addressDetails = new Address();
		Contact contact = new Contact();
		
		addressDetails.setCountry(country);
		addressDetails.setCity(city);
		addressDetails.setStreet(address);
		
		contact.setEmail(email);
		contact.setPhoneNumber(phoneNumber);
		
		profesor.setFirstName(firstName);
		profesor.setLastName(lastName);
		profesor.setUser(user);
		profesor.setAddress(addressDetails);
		profesor.setContact(contact);
		profesor.setIdentificationNo(identificationNo);

		return profesor;
	}

	public User addAdmin(String username, String password, UserType administracija) {
		
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setUserType(administracija);
		
		return user;

	}

	public Administrator addAdminDetails(String firstName, String lastName, String email, String phoneNumber,
			String country, String city, String address, User user, String identificationNo) {
		
		Administrator administrator = new Administrator();
		Address addressDetails = new Address();
		Contact contact = new Contact();
		
		addressDetails.setCountry(country);
		addressDetails.setCity(city);
		addressDetails.setStreet(address);
		
		contact.setEmail(email);
		contact.setPhoneNumber(phoneNumber);
		
		administrator.setFirstName(firstName);
		administrator.setLastName(lastName);
		administrator.setContact(contact);
		administrator.setAddress(addressDetails);
		administrator.setUser(user);
		administrator.setIdNumber(identificationNo);

		
		return administrator;
	}

	public Predmet addPredmet(String nazivPredmeta, String sifraPredmeta) {
		
		Predmet predmet = new Predmet();
		
		predmet.setNazivPredmeta(nazivPredmeta);
		predmet.setSifraPredmeta(sifraPredmeta);

		return predmet;
	}

	public Smer addSmer(String nazivSmera, String sifraSmera) {
		
		Smer smer = new Smer();
		smer.setSmerName(nazivSmera);
		smer.setSifraSmera(sifraSmera);

		return smer;
	}

}
