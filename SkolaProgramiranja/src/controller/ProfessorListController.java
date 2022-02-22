package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ProfesorList;
import service.ProfessorListService;

/**
 * Servlet implementation class ProfessorList
 */
@WebServlet(urlPatterns = {"/ProfessorListController"})
public class ProfessorListController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ProfessorListService service = new ProfessorListService();
		
		List<ProfesorList> professsorList = service.getProfessorList();
		
		System.out.println("U listi ima " + professsorList.size() + " prfesora");
	}

}
