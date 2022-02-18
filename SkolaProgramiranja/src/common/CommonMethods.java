package common;

import model.Address;
import model.Contact;
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

}
