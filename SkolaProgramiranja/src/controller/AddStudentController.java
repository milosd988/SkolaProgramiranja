package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Student;
import model.User;
import model.UserDetails;
import model.UserType;
import service.AddStudentService;

/**
 * Servlet implementation class AddStudentController
 */
@WebServlet("/AddStudentController")
public class AddStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		AddStudentService studentService = new AddStudentService();
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		String phoneNumber = request.getParameter("phoneNumber");
		String country = request.getParameter("country");
		String city = request.getParameter("city");
		String address = request.getParameter("street");
		String indexNo = request.getParameter("brojIndexa");
		
		User user = studentService.addStudent(username, password, UserType.STUDENT);
		UserDetails details = studentService.addStudentDetails(firstName, lastName, email, phoneNumber, country,
										city, address, user);
		Student student = new Student();
		student.setBrojIndexa(indexNo);
		
		boolean addStudents = studentService.addStudents(user, details, student);
		
		if(addStudents) {
			
			response.sendRedirect("jsp/admin.jsp");
		}
		else {
			response.sendRedirect("jsp/add-student.jsp");
		}
		
		
	}

}
