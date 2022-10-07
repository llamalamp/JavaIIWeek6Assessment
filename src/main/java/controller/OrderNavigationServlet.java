package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MovieItem;

/**
 * Servlet implementation class OrderNavigationServlet
 */
@WebServlet("/orderNavigationServlet")
public class OrderNavigationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public OrderNavigationServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String act = request.getParameter("doThisToItem");

		if (act.equals("order")) {
			MovieItemHelper mih = new MovieItemHelper();
			String title = request.getParameter("title");
			int quantity = Integer.parseInt(request.getParameter("quantity"));
			Integer tempId = Integer.parseInt(request.getParameter("id"));
			MovieItem itemToOrder = mih.searchForItemById(tempId);
			getServletContext().getRequestDispatcher("/CHANGEME").forward(request, response);
		} else if (act.equals("Place Order")) {
			MovieItemHelper mih = new MovieItemHelper();
			Integer tempId = Integer.parseInt(request.getParameter("id"));
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
