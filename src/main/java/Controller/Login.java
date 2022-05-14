package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Login {
	
	public static boolean check (int id , String pass) {
		boolean i = false;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "1234");
			PreparedStatement ps = con.prepareStatement("select * from students where id =? and pass =?");
			ps.setInt(1, id);
			ps.setString(2, pass);
			
			ResultSet rs = ps.executeQuery();
			 i = rs.next();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return i;
	
	}

}
