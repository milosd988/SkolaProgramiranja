package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Smer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idSmer;
	private String smerName;
	private String sifraSmera;
	@ManyToMany(mappedBy = "listaSmerova")
	private List<Predmet> listaPredmeta = new ArrayList<Predmet>();
	
	
	public int getIdSmer() {
		return idSmer;
	}
	public void setIdSmer(int idSmer) {
		this.idSmer = idSmer;
	}
	public String getSmerName() {
		return smerName;
	}
	public void setSmerName(String smerName) {
		this.smerName = smerName;
	}
	public String getSifraSmera() {
		return sifraSmera;
	}
	public void setSifraSmera(String sifraSmera) {
		this.sifraSmera = sifraSmera;
	}
	
	public List<Predmet> getListaPredmeta() {
		return listaPredmeta;
	}
	public void setListaPredmeta(List<Predmet> listaPredmeta) {
		this.listaPredmeta = listaPredmeta;
	}
	
	
	
	
	
	

}
