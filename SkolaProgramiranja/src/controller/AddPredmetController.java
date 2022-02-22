package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Predmet;
import service.AddPredmetSmerService;

/**
 * Servlet implementation class AddPredmetController
 */
@WebServlet("/AddPredmetController")
public class AddPredmetController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		AddPredmetSmerService service = new AddPredmetSmerService();
		
		String nazivPredmeta = request.getParameter("nazivPredmeta");
		String sifraPredmeta = request.getParameter("sifraPredmeta");
		
		Predmet predmet = service.addPredmet(nazivPredmeta, sifraPredmeta);
		
		boolean savePredmet = service.savePredmet(predmet);
		
		if(savePredmet) {
			response.sendRedirect("jsp/admin.jsp");
		}
		else {
			response.sendRedirect("jsp/add-predmet.jsp");
		}
		
		
	}

}
