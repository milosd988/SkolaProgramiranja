package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.User;
import model.UserType;
import service.LoginService;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Inside doPost() method");
		
		LoginService service = new LoginService();
		
		//prihvatamo parametre iz request object-a
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		
		System.out.println("UserName: " + userName);
		System.out.println("Password: " + password);
		
		
		
		boolean validacijaUseraIPassworda = service.validacijaUseraIPassworda(userName, password);
		if(validacijaUseraIPassworda) {
			//1.proveriti da li su username i pass null
			//1a.ako je username ili pass null ili prazan popuniti sva polja
			response.sendRedirect("view/prazan-unos.html");
		}
		else {
			//1b.ako nisu prazni ili null ulogovace se
			//2.da li postoji user u bazi sa username-om i pass-om
			User user = service.daLiPostojiUser(userName, password);
			if(user != null) {
				//2b.ako postoji user prebaciti ga na njegovu stranicu
				//otvaramo http sesiju
				HttpSession session = request.getSession();
				session.setAttribute("user", user);
				if(user.getUserType() == UserType.ADMINISTRACIJA) {
					response.sendRedirect("jsp/admin.jsp");
				}
				else if(user.getUserType() == UserType.PROFESOR) {
					response.sendRedirect("jsp/profesor.jsp");
				}
				else if(user.getUserType() == UserType.STUDENT) {
					response.sendRedirect("jsp/student.jsp");
				}
				else {
					response.sendRedirect("view/login-error.html");
				}
				
			}
			else {
				//2a.ako ne postoji vrati odgovor da pokusa ponovo logovanje
				response.sendRedirect("view/login.html");
			}
		}
		
		
		
		
		
		
	}

}
