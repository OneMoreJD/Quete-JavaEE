package org.wcs.hello;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SimpleHelloServlet
 */
@WebServlet(name = "SimpleHelloServlet", urlPatterns = {"/simple-hello"})
public class SimpleHelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SimpleHelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().print("C'était pas prévu de faire ça !");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String lastName = request.getParameter("lname");
		String firstName = request.getParameter("fname");
		int hour = Integer.parseInt(request.getParameter("hour"));
		
		request.setAttribute("lastName", lastName);
		request.setAttribute("firstName", firstName);

		String hello;
		if (hour < 12) {
			hello = "Good morning";
		} else if (hour >= 12 && hour < 18){
			hello = "Good afternoon";
		} else {
			hello = "Good evening";
		}
		request.setAttribute("hello", hello);
		
//		request.getRequestDispatcher(request.getContextPath() + "/custom-hello.jsp").forward(request, response);
		request.getRequestDispatcher("custom-hello.jsp").forward(request, response);
	}

}
