package Manipulate;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Crud.Delete;

/**
 * Servlet implementation class Delete1
 */
@WebServlet("/Delete1")
public class Delete1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
//		int id = Integer.parseInt(req.getParameter("userid"));
		
		String name = req.getParameter("username");
		
		Delete.delete(name);
		res.sendRedirect("Show");
	}

	
}

