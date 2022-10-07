package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MovieItem;

/**
 * Servlet implementation class AddMovieServlet
 */
@WebServlet("/addMovieServlet")
public class AddMovieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddMovieServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String title = request.getParameter("title");
		int quantity = Integer.parseInt(request.getParameter("quantity"));
		MovieItem mi = new MovieItem(title, quantity);
		MovieItemHelper mih = new MovieItemHelper();
		mih.insertItem(mi);
		getServletContext().getRequestDispatcher("/index.html").forward(request, response);
	}

}
