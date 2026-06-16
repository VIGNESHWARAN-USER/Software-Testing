package demo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeDAO {
		
	static Connection con = DBConnection.getConnection("jdbc:mysql://erp-vigneshwaran-6b62.k.aivencloud.com:16990/users", "avnadmin", "AVNS_pglAGGn58sK9XJ7RYqD");
	
	public void insertEmployee(Employee employee) throws SQLException
	{
		CallableStatement cs = con.prepareCall("call insert_employee(?, ?, ?)");
		
		cs.setInt(1, employee.getId());
		cs.setString(2, employee.getName());
		cs.setString(3,  employee.getDept());
		
		cs.execute();
	}
	
	public void deleteEmployee(int id) throws SQLException
	{
		CallableStatement cs = con.prepareCall("call delete_employee(?)");
		
		cs.setInt(1, id);
		
		int rows = cs.executeUpdate();
		
		System.out.println("Rows affected : "+rows);
	}
	
	public Employee getEmployeeByID(int id) throws SQLException
	{
		CallableStatement cs = con.prepareCall("call get_employee_by_id(?, ?, ?)");
		
		cs.setInt(1,  id);
	    cs.registerOutParameter(2, java.sql.Types.VARCHAR);
	    cs.registerOutParameter(3, java.sql.Types.VARCHAR);

	    cs.execute();
	    String name = cs.getString(2);
	    String dept = cs.getString(3);
		
		return new Employee(id, name, dept);
	}
	
	public void updateEmployee(Employee employee) throws SQLException
	{
		CallableStatement cs = con.prepareCall("call update_employee(?, ?, ?)");
		
		cs.setInt(1, employee.getId());
		cs.setString(3, employee.getName());
		cs.setString(2,  employee.getDept());
		
		cs.execute();
	}
	
	public void displayTable() throws SQLException
	{
		PreparedStatement ps = con.prepareStatement("select * from employee");
		ResultSet rs = ps.executeQuery();
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(2));
		}
	}
	
}
