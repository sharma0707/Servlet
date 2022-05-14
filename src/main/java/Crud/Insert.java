package Crud;

import java.sql.Connection;

import java.sql.PreparedStatement;

import Dao.Dao;
import Dao.Main;

public class Insert {
	public static  int insertdata(Main m) {
		int i = 0;
		try {
			
			Connection conn = Dao.getConnection();
			PreparedStatement ps = conn.prepareStatement("insert into students (id, name, email, pass, college) values (?,?,?,?,?)");
			
			ps.setInt(1, m.getId());
			ps.setString(2, m.getName());
			ps.setString(3, m.getEmail());
			ps.setString(4, m.getPass());
			ps.setString(5, m.getCollege());
			
		 i = ps.executeUpdate();
			
		}catch (Exception e) {
			System.out.println(e);
		}
		return i;
	}
}
