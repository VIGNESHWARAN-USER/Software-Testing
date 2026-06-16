package example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CreateTable {
	public static void main(String args[])
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://erp-vigneshwaran-6b62.k.aivencloud.com:16990/users", "avnadmin", "AVNS_pglAGGn58sK9XJ7RYqD");
			
			PreparedStatement ps = con.prepareStatement("Create Table userTable(id decimal(10) primary key, name varchar(100));");
			
			
			int qs = ps.executeUpdate();
						
			System.out.println(qs);
			
			con.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
