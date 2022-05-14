package Manipulate;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.Main;

/**
 * Servlet implementation class Update
 */
@WebServlet("/Show")
public class Show extends HttpServlet {

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.print("<link rel = 'stylesheet' type= text/css href = css.css>");

		out.print("Student Details");

		List<Main> list = GetDetails.getalldetails();

		out.print("<table border = '1' id = std");
		out.print("<tr><th>ID</th><th>Name</th><th>Email</th>" + "<th>pass</th><th>college</th>"
				+ "<th>Edit</th><th>delete</th></tr>");

		for (Main m : list) {
			out.print("<tr><td>" + m.getId() + "</td><td>" + m.getName() + "</td><td>" + m.getEmail() + "</td><td> "
					+ m.getPass() + "</td><td> " + m.getCollege() + "</td><td> <a href = 'Update1?id=" + m.getId()
					+ "'>edit<a/></td><td><a href ='Delete1?id=" + m.getId() + "'>delete</a></td></tr>");
		}

		out.print("</table>");
		out.close();

	}
}
