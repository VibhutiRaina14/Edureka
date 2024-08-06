package Servlet_Package;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletClass
 */
@WebServlet("/ServletClass")
public class ServletClass extends HttpServlet {
	//private static final long serialVersionUID = 1L;
      private String mymsg;
      //private int a = request.getParameter("box1");
      //String password = request.getParameter("box2");
      
      public void init() throws ServletException{
    	  mymsg="Hello World";
    	  
      }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//setting the content type of webpage
		response.setContentType("text/html");
		//writing msg to web page
		PrintWriter out=response.getWriter();
		out.println("<h1>"+mymsg+"</h1>");
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
