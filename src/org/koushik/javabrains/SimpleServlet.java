package org.koushik.javabrains;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SimpleServlet
 */
@WebServlet(description = "A simple servlet", urlPatterns = { "/SimpleServlet" },
initParams= {@WebInitParam(name="defaultUser", value="John Doe")})
public class SimpleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Hello from web");
		PrintWriter writer = response.getWriter();
		writer.write("<html>");
		writer.write("<head>");
		writer.write("</head>");
		writer.write("<body>");
		writer.write("<h1 style='color:red'>Hello</h1>"); //write main portion of html code here

		String defaultUser = this.getServletConfig().getInitParameter("defaultUser");
		writer.write("<h1 style='color:blue'>"+ defaultUser +"</h1>"); //write main portion of html code here
		writer.write("</body>");
		writer.write("</html>");		
	}

}
