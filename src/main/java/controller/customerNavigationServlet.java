package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Customer;
import model.MovieItem;
import model.OrderItem;

/**
 * Servlet implementation class customerNavigationServlet
 */
@WebServlet("/customerNavigationServlet")
public class customerNavigationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public customerNavigationServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		CustomerHelper ch = new CustomerHelper();
		String act = request.getParameter("doThisToItem");
		MovieItemHelper mih = new MovieItemHelper();
		String path = "/showAllCustomersServlet";

		if (act.equals("delete")) {
			try {
				Integer tempId = Integer.parseInt(request.getParameter("id"));
				Customer itemToDelete = ch.searchForCustomerById(tempId);
				ch.deleteCustomer(itemToDelete);
			} catch (NumberFormatException e) {
				System.out.println("Forgot to select a customer");
			}

		} else if (act.equals("order")) {
			try {
				Integer tempId = Integer.parseInt(request.getParameter("id"));
				Customer customerToOrder = ch.searchForCustomerById(tempId);
				request.setAttribute("customerToOrder", customerToOrder);
				path = "/order-movie.jsp";
			} catch (NumberFormatException e) {
				System.out.println("Forgot to select an item");
			}
			request.setAttribute("allItems", mih.showAllItems());

		} else if (act.equals("add"))

		{
			path = "http://localhost:8080/week5assessment/addCustomerServlet";
		}else if (act.equals("Place Order")) {
			
			
				Integer tempId = Integer.parseInt(request.getParameter("id"));
				MovieItem itemToOrder = mih.searchForItemById(tempId);
				request.setAttribute("itemToOrder", itemToOrder);
				path = "/order-movie2.jsp";
			
			
			Integer tempIdc = Integer.parseInt(request.getParameter("cid"));
			Customer customerToOrder = ch.searchForCustomerById(tempIdc);
			request.setAttribute("customerToOrder", customerToOrder);
			
			OrderItemHelper oh = new OrderItemHelper();
			OrderItem newItemToOrder = new OrderItem(customerToOrder, itemToOrder);
			oh.insertItem(newItemToOrder);
			
		}

		getServletContext().getRequestDispatcher(path).forward(request, response);
	}

}
