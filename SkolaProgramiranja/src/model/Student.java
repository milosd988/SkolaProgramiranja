package model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Student extends UserDetails {
	
	
	private String brojIndexa;
	@ManyToOne
	private Smer smer;
	
	
	public String getBrojIndexa() {
		return brojIndexa;
	}
	public void setBrojIndexa(String brojIndexa) {
		this.brojIndexa = brojIndexa;
	}
	public Smer getSmer() {
		return smer;
	}
	public void setSmer(Smer smer) {
		this.smer = smer;
	}
	
	

}
