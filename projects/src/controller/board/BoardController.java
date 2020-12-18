package controller.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/board")
public class BoardController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		String actionName = request.getParameter("a");

		String no_ = request.getParameter("no");

		int no = 0;

		if (no_ != null && !no_.equals(""))
			no = Integer.parseInt(no_);

		System.out.println("board:" + actionName);

		if ("insertBoardForm".equals(actionName)) {

			request.getRequestDispatcher("/WEB-INF/view/board/insertBoardForm.jsp").forward(request, response);

		} else if ("boardUpdateForm".equals(actionName)) {

			request.setAttribute("no", no_);
			request.getRequestDispatcher("/WEB-INF/view/board/boardUpdateForm.jsp").forward(request, response);

		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
