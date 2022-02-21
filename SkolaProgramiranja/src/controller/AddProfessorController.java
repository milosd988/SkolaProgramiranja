package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Profesor;
import model.User;
import model.UserType;
import service.AddProfessorService;

/**
 * Servlet implementation class AddProfessorController
 */
@WebServlet("/AddProfessorController")
public class AddProfessorController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		AddProfessorService service = new AddProfessorService();
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		String phoneNumber = request.getParameter("phoneNumber");
		String country = request.getParameter("country");
		String city = request.getParameter("city");
		String address = request.getParameter("street");
		String identificationNo = request.getParameter("identificationNo");
		
		User user = service.addProfessor(username, password, UserType.PROFESOR);
		Profesor profesor = service.addProfessorDetails(firstName, lastName, email, phoneNumber, country, city, address,
				user, identificationNo);
		
		boolean saveProfessor = service.saveProfessor(user, profesor);
		
		if(saveProfessor) {
			response.sendRedirect("jsp/admin.jsp");
		}
		else {
			response.sendRedirect("jsp/add-profesor.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
