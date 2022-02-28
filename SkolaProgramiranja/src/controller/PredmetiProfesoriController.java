package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Predmet;
import model.Profesor;
import service.ProfessorListService;

/**
 * Servlet implementation class PredmetiProfesoriController
 */
@WebServlet("/PredmetiProfesoriController")
public class PredmetiProfesoriController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PredmetiProfesoriController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ProfessorListService service = new ProfessorListService();
		
		String idProfesor = request.getParameter("idProfesor");
		System.out.println("ID profesora je: " + idProfesor);
		
		Profesor profesor = service.getProfesorId(idProfesor);
		List<Predmet> predmeti = service.getPredmet();
		
		request.setAttribute("idProfesor", profesor);
		request.setAttribute("predmeti", predmeti);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("jsp/predmet-profesor.jsp");
		
		dispatcher.forward(request, response);
		
		
		
	}

}
