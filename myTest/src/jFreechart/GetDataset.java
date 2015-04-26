package jFreechart;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.jfree.data.category.DefaultCategoryDataset;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class GetDataset {

	public DefaultCategoryDataset getCategoryDateset(){
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost/test?user=root&password=19501517";
			Connection conn = (Connection) DriverManager.getConnection(url);
			PreparedStatement stat = (PreparedStatement) conn.prepareStatement("select * from military_report");
			ResultSet rs = (ResultSet) stat.executeQuery();
			
			while(rs.next()){
				dataset.addValue(rs.getInt("sum"), rs.getString("country"), rs.getString("unit"));
			}
			rs.close();
			stat.close();
			conn.close();
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return dataset;
	}
}
