package databaseRelativeQuery;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class Test {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://10.21.23.135/test_database?user=root&password=19501517";
			Connection conn = (Connection) DriverManager.getConnection(url);
			PreparedStatement stat = (PreparedStatement) conn.prepareStatement("select * from test1 left outer join test2 on test1.id = test2.id left outer join test3 on test2.id = test3.id");
			ResultSet rs = (ResultSet) stat.executeQuery();
			
			while(rs.next()){
				System.out.println(rs.getInt("id") + rs.getString("name") + rs.getInt("age") + rs.getString("sex") + rs.getString("address"));
			}
			rs.close();
			stat.close();
			conn.close();
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
