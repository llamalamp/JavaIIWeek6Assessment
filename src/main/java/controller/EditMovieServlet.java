package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MovieItem;

/**
 * Servlet implementation class EditMovieServlet
 */
@WebServlet("/editMovieServlet")
public class EditMovieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditMovieServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MovieItemHelper mih = new MovieItemHelper();
		String title = request.getParameter("title");
		int quantity = Integer.parseInt(request.getParameter("quantity"));
		Integer tempId = Integer.parseInt(request.getParameter("id"));
		MovieItem itemToUpdate = mih.searchForItemById(tempId);
		itemToUpdate.setMovieTitle(title);
		itemToUpdate.setQuantity(quantity);
		mih.updateItem(itemToUpdate);
		getServletContext().getRequestDispatcher("/showAllMoviesServlet").forward(request, response);
	}

}
