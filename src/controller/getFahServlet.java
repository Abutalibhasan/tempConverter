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
 * Servlet implementation class getFahServlet
 */
@WebServlet("/getFahServlet")
public class getFahServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getFahServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
		// TODO Auto-generated method stub
		
		String celsius = request.getParameter("celsius");

		TempConverter conv = new TempConverter(Integer.parseInt(celsius));
		request.setAttribute("Temp", conv);
		getServletContext().getRequestDispatcher("/res.jsp").forward(request, response);
		PrintWriter writer = response.getWriter();
		writer.println(conv.toFah());
		writer.close();
		} catch(Exception e) {
			System.out.println("Invalid Input!");
		}
	}

}
