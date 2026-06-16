package demo;

import java.sql.SQLException;
import java.util.Scanner;

public class EmployeeManagement {
	public static void main(String args[]) throws SQLException
	{
		EmployeeDAO dao = new EmployeeDAO();
		Scanner sc = new Scanner(System.in);
		int choice;
		
		System.out.println("------------Employee Management System------------");
		System.out.println("1. Add Employee");
		System.out.println("2. Delete Employee");
		System.out.println("3. Get Employee By Employee");
		System.out.println("4. Update Employee");
		System.out.println("5. Display Table");
		System.out.println("6. Exit");
		
		while(true)
		{
			System.out.print("Enter your choice : ");
			choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
					System.out.print("Enter the id: ");
					int id = sc.nextInt();
					sc.nextLine();
					System.out.print("Enter the name: ");
					String name = sc.nextLine();
					System.out.print("Enter the dept: ");
					String dept = sc.nextLine();
					dao.insertEmployee(new Employee(id, name, dept));
					break;
				case 2:
					System.out.print("Enter the id: ");
					id = sc.nextInt();
					dao.deleteEmployee(id);
					break;
				case 3:
					System.out.print("Enter the id: ");
					id = sc.nextInt();
					System.out.println(dao.getEmployeeByID(id));
					break;
				case 4:
					System.out.print("Enter the id: ");
					id = sc.nextInt();
					sc.nextLine();
					System.out.print("Enter the name: ");
					name = sc.nextLine();
					System.out.print("Enter the dept: ");
					dept = sc.nextLine();
					dao.updateEmployee(new Employee(id, name, dept));
					break;
				case 5:
					dao.displayTable();
					break;
				case 6:
					System.out.println("Exiting, Thank You!");
					return;
				default:
					System.out.println("Invalid Input, Try again");
			}
		}
	}
}
