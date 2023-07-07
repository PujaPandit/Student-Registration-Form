package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/login")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String em=request.getParameter("em");
		String ps=request.getParameter("ps");
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		RequestDispatcher rd;
		
		if("demo@gmail.com".equals(em) && "demo".equals(ps))
		{
			// home page redirect
			
			rd= request.getRequestDispatcher("/servlet2");
			rd.forward(request, response);
		}else {
			// redirect login page
			
						rd=request.getRequestDispatcher("/login.html");
						rd.include(request, response);
						out.print("<h4>Invalid email & password</h4>");
	
	}

}
}
