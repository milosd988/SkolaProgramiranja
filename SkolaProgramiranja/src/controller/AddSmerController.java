package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Smer;
import service.AddPredmetSmerService;

/**
 * Servlet implementation class AddSmerController
 */
@WebServlet("/AddSmerController")
public class AddSmerController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		AddPredmetSmerService service = new AddPredmetSmerService();
		
		String nazivSmera = request.getParameter("smerName");
		String sifraSmera = request.getParameter("sifraSmera");
		
		Smer smer = service.addSmer(nazivSmera, sifraSmera);
		
		boolean saveSmer = service.saveSmer(smer);
		
		if(saveSmer) {
			response.sendRedirect("jsp/admin.jsp");
		}
		else {
			response.sendRedirect("jsp/add-smer.jsp");
		}
		
	}

}
