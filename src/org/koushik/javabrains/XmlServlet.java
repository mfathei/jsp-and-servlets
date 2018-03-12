package org.koushik.javabrains;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class XmlServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		String userName = request.getParameter("userName");
		HttpSession session = request.getSession();
		ServletContext context = request.getServletContext();
		if (userName != null && userName != "") {
			session.setAttribute("savedUserName", userName);
			context.setAttribute("savedUserName", userName);
		}
		response.getWriter().write("<H3>Hello " + userName + " from GET</H3>");
		response.getWriter().write("<H3>session UserName is " + session.getAttribute("savedUserName") + " </H3>");
		response.getWriter().write("<H3>context UserName is " + context.getAttribute("savedUserName") + " </H3>");
		String defaultUser = this.getServletConfig().getInitParameter("defaultUser");
		response.getWriter().write("<h1 style='color:blue'>"+ defaultUser +"</h1>"); 
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		String userName = request.getParameter("userName");
		String fullName = request.getParameter("fullName");
		String prof = request.getParameter("prof");
		String[] location = request.getParameterValues("location");
		PrintWriter out = response.getWriter();
		out.write("<H3>Hello " + userName + " from POST</H3>");
		out.write("<p>Your full name is : " + fullName + " </p>");
		out.write("<p>You are a : " + prof + " </p>");
		out.write("<p>You work in : " + location.length + " places</p>");
		for (int i = 0; i < location.length; i++) {
			out.write("<p>" + location[i] + " </p>");
		}
	}
}
