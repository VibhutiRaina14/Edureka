package Servlet_Request_Response;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletGet
 */
@WebServlet("/ServletGet")
public class ServletGet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter out=response.getWriter();
		try {
			String val1=request.getParameter("val1");
			String val2=request.getParameter("val2");
			out.println("<h2> Welcome "+val1+"<h2>");
		}
		finally {
			out.close();
		}
	}

	

}
