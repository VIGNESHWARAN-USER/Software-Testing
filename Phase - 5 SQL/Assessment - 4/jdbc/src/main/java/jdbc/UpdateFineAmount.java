package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UpdateFineAmount {

	public static void main(String[] args) {
		
		try
		{
			String url =  "jdbc:mysql://erp-vigneshwaran-6b62.k.aivencloud.com:16990/lms";
			String username = "avnadmin";
			String password = "AVNS_pglAGGn58sK9XJ7RYqD";
			
			Connection con = DBConnection.getConnection(url, username, password);
			
			PreparedStatement ps = con.prepareStatement("Select * from books");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				System.out.println("Book ID: "+rs.getInt("book_id")+"\nBook Name: "+rs.getString("title")+"\nAuthor: "+rs.getString("Author")+"\n");
			}
			
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
