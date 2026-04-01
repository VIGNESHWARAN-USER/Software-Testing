package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RetrieveAllBooks {

	public static void main(String[] args) {
		
		try
		{
			String url =  "jdbc:mysql://erp-vigneshwaran-6b62.k.aivencloud.com:16990/lms";
			String username = "avnadmin";
			String password = "AVNS_pglAGGn58sK9XJ7RYqD";
			
			Connection con = DBConnection.getConnection(url, username, password);
			
			PreparedStatement ps = con.prepareStatement("UPDATE members m JOIN fines b ON m.member_id = b.member_id SET b.fine_amount = 500 WHERE m.membership_type = 'BASIC';");
			
			int rs = ps.executeUpdate();
			
			System.out.println(rs);
			
			ps = con.prepareStatement("SELECT m.first_name, m.last_name, m.membership_type, b.fine_amount from members m JOIN fines b ON m.member_id = b.member_id WHERE m.membership_type = 'BASIC';");
			
			ResultSet result = ps.executeQuery();
			
			
			while(result.next())
			{
				System.out.println("Member Name: "+result.getString("first_name")+" "+result.getString("last_name")+"\n Membership Type: "+result.getString("membership_type")+"\nFine Amount: "+result.getString("fine_amount"));
			}
			
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		

	}

}
