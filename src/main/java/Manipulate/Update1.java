package Manipulate;

import java.io.IOException;
import java.lang.RuntimeException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.Main;

/**
 * Servlet implementation class Update1
 */
@WebServlet("/Update1")
public class Update1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
//		System.out.println(req.getParameterMap().containsKey("userid"));
		
//		int userid = Integer.parseInt(req.getParameterMap().get("userid")[0]);
		
//	    int id = Integer.parseInt(req.getParameter("userid"));
		String userid = req.getParameter("userid");
		int id = Integer.parseInt(userid);

		GetDetails instance = GetDetails.getDetailsInstace();
		
		Main m  = instance.getdetails(id);
		out.print("<form action = 'Update2' method = 'post'>");
		out.print("<table>");
		out.print("<tr<td></td><td><input type = 'hidden'  name ='id' value ='"+m.getId()+"'/></td></tr>");
		out.print("<tr<td></td><td><input type = 'hidden'  name ='id' value ='"+m.getName()+"'/></td></tr>");
		out.print("<tr<td></td><td><input type = 'hidden'  name ='id' value ='"+m.getName()+"'/></td></tr>");
		out.print("<tr<td></td><td><input type = 'hidden'  name ='id' value ='"+m.getEmail()+"'/></td></tr>");
		out.print("<tr<td></td><td><input type = 'hidden'  name ='id' value ='"+m.getPass()+"'/></td></tr>");
		out.print("<tr<td></td><td><input type = 'hidden'  name ='id' value ='"+m.getCollege()+"'/></td></tr>");
		
		out.print("</table></form>");
	
	}

}
