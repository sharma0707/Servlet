package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Welcome
 */
@WebServlet("/Welcome")
public class Welcome extends HttpServlet {
	

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		

		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		String id = req.getParameter("userid");
		
		out.println("welcome"+" "+ id);
		out.println("For Updation: " +" "+ "<a href = 'index.jsp'> Click me</a>");

	}

}
