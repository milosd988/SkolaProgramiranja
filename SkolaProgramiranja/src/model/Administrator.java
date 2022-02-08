package model;

import javax.persistence.Entity;

@Entity
public class Administrator extends UserDetails {
	
	
	private String idNumber;

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}
	
	
	

}
