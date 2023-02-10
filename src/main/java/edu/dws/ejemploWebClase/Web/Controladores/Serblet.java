package edu.dws.ejemploWebClase.Web.Controladores;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "hablar", urlPatterns = { "/hablar" })
public class Serblet extends HttpServlet {
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Serblet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String uno = request.getParameter("fraseuno");
		String dos = request.getParameter("frasedos");
		String frase = uno + dos;
		// Opción session: vive durante la sesión.
		request.getSession().setAttribute("resultadoFrase", frase);
		RequestDispatcher rd;
		rd = request.getRequestDispatcher("/ejemplo.jsp");
		rd.forward(request, response);
	}

}
