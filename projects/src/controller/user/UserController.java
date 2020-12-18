package controller.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/user")
public class UserController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
	
		String actionName =request.getParameter("a");
		System.out.println("user:" + actionName);
		
		
		if ("signUpForm".equals(actionName)) {
			
			
			request.getRequestDispatcher("/WEB-INF/view/user/signUpForm.jsp").forward(request, response);
			

			
		} else if ("loginForm".equals(actionName)) {
			
			request.getRequestDispatcher("/WEB-INF/view/user/loginForm.jsp").forward(request, response);
			
				
		}
	}
	


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
