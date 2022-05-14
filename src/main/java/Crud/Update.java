package Crud;

import java.sql.Connection;
import java.sql.PreparedStatement;

import Dao.Dao;
import Dao.Main;

public class Update {
	
	public static  int update(Main m) {
		int i=0;
		try {
			Connection conn = Dao.getConnection();
			PreparedStatement ps = conn.prepareStatement("update students set id =?, name =?, pass=?, email=?, college =? ");
			
			ps.setInt(1, m.getId());
			ps.setString(2, m.getName());
			ps.setString(4, m.getPass());
			ps.setString(3, m.getEmail());
			ps.setString(5, m.getCollege());
			
			i= ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return i;	
	}

}
