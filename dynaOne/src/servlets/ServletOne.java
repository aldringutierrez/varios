package servlets;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ejbs.EjbOne;

@WebServlet("/ServletOne")
public class ServletOne extends HttpServlet {
	@EJB
	EjbOne ejb;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		Integer qq = Integer.valueOf(q1)+Integer.valueOf(q2);
		String q3 = "La suma de "+q1+" y "+q2+" es igual a "+qq;
		response.getWriter().append(q3);
		 */		
		String q1 = request.getParameter("q1");
		String q2 = request.getParameter("q2");
		ejb.setI(Integer.valueOf(q1));
		ejb.setJ(Integer.valueOf(q2));
		ejb.add();
		String q3 = "La suma EJB de "+q1+" y "+q2+" es igual a "+ejb.getK();
		response.getWriter().append(q3);

	}

}
