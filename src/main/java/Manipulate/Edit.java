package Manipulate;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.Main;

/**
 * Servlet implementation class Edit
 */
@WebServlet("/Edit")
public class Edit extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out =  response.getWriter();
		
//        int userid = Integer.parseInt(request.getParameterMap().get("userid")[0]);
	    int id = Integer.parseInt(request.getParameter("userid"));
	    GetDetails instance = GetDetails.getDetailsInstace();
	
		try {
			
			Connection connection = instance.getConnection();		
			PreparedStatement ps = connection.prepareStatement(" Update user set name = ? where id = ?");
			
			ps.setInt(1, id);
//			ps.setString(2, name);
//			ps.setString(1, name);
			ResultSet rs = ps.executeQuery();
			
			Main m = new Main();
			if(rs.next()) {
				
				m.setId(rs.getInt(1));
				m.setName(rs.getString(2));
				m.setEmail(rs.getString(3));
				m.setPass(rs.getString(4));
				m.setCollege(rs.getString(5));
			}
		}
			catch (Exception e) {
				e.printStackTrace();
			}
	}
}
		
	

