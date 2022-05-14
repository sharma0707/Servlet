package Manipulate;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Dao.Dao;
import Dao.Main;

public class GetDetails {

	Connection connection;

	private GetDetails() {

		try {
			this.connection = Dao.getConnection();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	public static GetDetails getDetailsInstace() {

		return new GetDetails();
	}

	public Connection getConnection() {
		return this.connection;

	}

	public Main getdetails(int id) {

		Main m = new Main();

		System.out.print(id);

		try {
			Connection con = Dao.getConnection();

			PreparedStatement ps = con.prepareStatement("select * from students where id = ? ");

			ps.setInt(1, id);
//			ps.setString(1, name);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {

				m.setId(rs.getInt(1));
				m.setName(rs.getString(2));
				m.setEmail(rs.getString(3));
				m.setPass(rs.getString(4));
				m.setCollege(rs.getString(5));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return m;
	}

	public static List<Main> getalldetails() {
		List<Main> list = new ArrayList<Main>();

		try {
			Connection conn = Dao.getConnection();
			PreparedStatement ps = conn.prepareStatement("select * from students");
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				Main m = new Main();
				m.setId(rs.getInt(1));
				m.setName(rs.getString(2));
				m.setEmail(rs.getString(3));
				m.setPass(rs.getString(4));
				m.setCollege(rs.getString(5));

				list.add(m);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

}
