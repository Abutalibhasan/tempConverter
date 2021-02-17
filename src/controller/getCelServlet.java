package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.TempConverter;

/**
 * Servlet implementation class getCelServlet
 */
@WebServlet("/getCelServlet")
public class getCelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getCelServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
		
		String Fahrenheit = request.getParameter("Fahrenheit");
		TempConverter con = new TempConverter((Double.parseDouble(Fahrenheit)));
		
		request.setAttribute("userTemp", con);
		getServletContext().getRequestDispatcher("/result.jsp").forward(request, response);
		PrintWriter writer = response.getWriter();
		writer.println(con.toCelsius());
		writer.close();} catch(Exception e) {
			System.out.println("Invalid Input!");
		}
	}

}
