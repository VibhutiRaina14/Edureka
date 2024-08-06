package com.org.Servlet_Package;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestDispatcherServlet
 */
@WebServlet("/RequestDispatcherServlet")
public class RequestDispatcherServlet1 extends HttpServlet {
	
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		
//	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String n=request.getParameter("val1");
		String u=request.getParameter("val2");
		String p=request.getParameter("val3");
		
		if(p.equals("Vibhuti"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("RequestDisplayServer2");//control goes to 2nd servlet
			rd.forward(request,response);
			
		}
		else
		{
			out.print("Incorrect Username or password");
			RequestDispatcher rd=request.getRequestDispatcher("login.html");
			rd.include(request, response);//includes the error msg
		}
		
	}

}
