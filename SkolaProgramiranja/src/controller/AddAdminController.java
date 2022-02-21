package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Administrator;
import model.User;
import model.UserType;
import service.AddAdminService;

/**
 * Servlet implementation class AddAdminController
 */
@WebServlet("/AddAdminController")
public class AddAdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		AddAdminService service = new AddAdminService();
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		String phoneNumber = request.getParameter("phoneNumber");
		String country = request.getParameter("country");
		String city = request.getParameter("city");
		String address = request.getParameter("street");
		String identificationNo = request.getParameter("idNumber");
		
		User user = service.addAdmin(username, password, UserType.ADMINISTRACIJA);
		Administrator admin = service.addAdminDetails(firstName, lastName, email, phoneNumber, country, city, address, user, identificationNo);
		
		boolean saveAdmin = service.saveAdmin(user, admin);
		
		if(saveAdmin) {
			response.sendRedirect("jsp/admin.jsp");
		}
		else {
			response.sendRedirect("jsp/add-admin.jsp");
		}
	}

}
