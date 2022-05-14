package Manipulate;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Crud.Update;
import Dao.Main;

/**
 * Servlet implementation class Update
 */
@WebServlet("/Update2")
public class Update2 extends HttpServlet {
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
		
		int i = Update.update(m);
		if(i >0) {
			res.sendRedirect("show");
		}else {
			out.print("sorry! unable to update record");
		}
		
	}

}
