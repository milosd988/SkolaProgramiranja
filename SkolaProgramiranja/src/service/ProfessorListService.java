package service;

import java.util.List;

import dao.ProfessorListDao;
import model.Predmet;
import model.ProfesorList;

public class ProfessorListService {

	ProfessorListDao dao = new ProfessorListDao();

	public List<ProfesorList> getProfessorList() {

		return dao.getProfessorList();
	}

	public List<Predmet> getPredmet() {

		return dao.getPredmet();
	}
}
