package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MemberDAO {
	Connection con;
	PreparedStatement stmt;
	ResultSet rs;
	String sql;

	public MemberDAO() {
		String url = "jdbc:mariadb://localhost:3306/user";
		String username = "root";
		String password = "7540";

		try {
			Class.forName("org.mariadb.jdbc.Driver");

			con = DriverManager.getConnection(url, username, password);
			//stmt = con.createStatement();

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public int insert(MemberDTO dto) {
		int res = 0;

		sql = "INSERT INTO user" 
			+ "(id, pw, name, tel, gender, age)VALUES"
			+ "(?,?,?,?,?,?, SYSDATE())";

		System.out.println(sql);

		try {
			stmt = con.prepareStatement(sql);
			stmt.setString(1, dto.id);
			stmt.setString(2, dto.name);
			stmt.setString(3, dto.pw);
			stmt.setString(4, dto.tel);
			stmt.setString(5, dto.gender);
			stmt.setInt(6, dto.age);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return res;
	}

	public void close() {

		if (rs != null)
			try {
				rs.close();
			} catch (SQLException e) {
			}
		if (stmt != null)
			try {
				stmt.close();
			} catch (SQLException e) {
			}
		if (con != null)
			try {
				con.close();
			} catch (SQLException e) {
			}
	}
}
