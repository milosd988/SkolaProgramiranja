package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Profesor extends UserDetails {
	
	private String identificationNo;
	@OneToMany
	private List<Predmet> predmetiNaKojimaPredaje = new ArrayList<Predmet>();
	
	
	public String getIdentificationNo() {
		return identificationNo;
	}
	public void setIdentificationNo(String identificationNo) {
		this.identificationNo = identificationNo;
	}
	public List<Predmet> getPredmetiNaKojimaPredaje() {
		return predmetiNaKojimaPredaje;
	}
	public void setPredmetiNaKojimaPredaje(List<Predmet> predmetiNaKojimaPredaje) {
		this.predmetiNaKojimaPredaje = predmetiNaKojimaPredaje;
	}
	
	
	
	

}
