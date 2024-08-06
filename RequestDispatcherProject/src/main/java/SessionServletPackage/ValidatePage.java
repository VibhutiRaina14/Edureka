package SessionServletPackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ValidatePage")
public class ValidatePage extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String u=request.getParameter("val1");
		String p=request.getParameter("val2");
		if(p.equals("Vibhuti"))
		{
			HttpSession hs=request.getSession();
			hs.setAttribute("user", u);
			response.sendRedirect("Darshan");	
		}
		else
		{
			out.print("Incorrect Username or password");
			HttpSession hs=request.getSession();
			response.sendRedirect("cookie.html");
		}
	}

}
