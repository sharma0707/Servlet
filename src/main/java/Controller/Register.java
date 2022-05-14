package Controller;

import java.io.IOException;


import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Crud.Insert;
import Dao.Main;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
	res.setContentType("text/html");
	PrintWriter out = res.getWriter();
	
	int id = Integer.parseInt(req.getParameter("userid"));
	String name = req.getParameter("username");
	String email = req.getParameter("useremail");
	String pass = req.getParameter("userpass");
	String college = req.getParameter("usercollege");
	
		Main m = new Main();
		m.setId(id);
		m.setName(name);
		m.setEmail(email);
		m.setPass(pass);
		m.setCollege(college);
		
		int i = Insert.insertdata(m);
		if(i > 0) {
			out.print("Registered successfully");
//			req.getRequestDispatcher("index.html").include(req, res);
		}
		else {
//			out.print("Sorry ! unable to save record");
		
		}
	}
}
