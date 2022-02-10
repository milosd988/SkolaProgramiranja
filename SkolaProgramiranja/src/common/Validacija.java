package common;

public class Validacija {

	public boolean validacijaUseraIPassworda(String userName, String password) {

		boolean proveraUseraIPassworda = false;
		
		if(userName == null || userName.isEmpty()) {
			proveraUseraIPassworda = true;
		}
		
		if(password == null || password.isEmpty()) {
			proveraUseraIPassworda = true;
		}
		
		return proveraUseraIPassworda;
	}

}
