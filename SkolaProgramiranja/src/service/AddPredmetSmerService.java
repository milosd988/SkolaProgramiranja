package service;

import common.CommonMethods;
import dao.AddPredmetSmerDao;
import model.Predmet;
import model.Smer;

public class AddPredmetSmerService {
	
	CommonMethods common = new CommonMethods();
	AddPredmetSmerDao dao = new AddPredmetSmerDao();
	
	
	public Predmet addPredmet(String nazivPredmeta, String sifraPredmeta) {

		return common.addPredmet(nazivPredmeta, sifraPredmeta);
	}


	public boolean savePredmet(Predmet predmet) {

		return dao.savePredmet(predmet);
	}


	public Smer addSmer(String nazivSmera, String sifraSmera) {

		return common.addSmer(nazivSmera, sifraSmera);
	}


	public boolean saveSmer(Smer smer) {

		return dao.saveSmer(smer);
	}

}
