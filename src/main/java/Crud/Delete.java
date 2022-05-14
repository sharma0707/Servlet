package Crud;

import java.sql.Connection;
import java.sql.PreparedStatement;

import Dao.Dao;

public class Delete {
	public static int delete(String name) {
		int i =0;
		try {
			Connection conn = Dao.getConnection();
			PreparedStatement ps = conn.prepareStatement("delete from students where name=?");
//			ps.setInt(1, id);
			ps.setString(1, name);
			i=ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return i;
	}

}
