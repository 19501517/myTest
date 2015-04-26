package test;

import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class MainTest {

	Character[] number;

	public static void main(String[] args) {
		new MainTest().sqlTest();
		
		
	}

	public void sqlTest() {
		String sql = "select * from department";
		String url = "jdbc:mysql://127.0.0.1:3306/test";
		String username = "root";
		String password = "19501517";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = (Connection) DriverManager.getConnection(url, username, password);
			PreparedStatement stat = (PreparedStatement) conn
					.prepareStatement(sql);
			ResultSet rs = (ResultSet) stat.executeQuery();
			
			
			
			while (rs.next()) {
				System.out.println(rs.getInt("id"));
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}