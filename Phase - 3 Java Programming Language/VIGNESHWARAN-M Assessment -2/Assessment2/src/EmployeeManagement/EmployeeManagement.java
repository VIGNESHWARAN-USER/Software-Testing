package EmployeeManagement;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class EmployeeManagement {
	public static Employee employee;
	
	public static void main(String args[]) throws IOException
	{
		BufferedReader bf = new BufferedReader(new FileReader("src/EmployeeManagement/input.txt"));
		
		String[] employeeDetails = bf.readLine().split(" ");
		
		System.out.print("Enter employee Id: ");
		int id = Integer.parseInt(employeeDetails[0]);
		System.out.println(id);
		System.out.print("Enter employee name: ");
		String name = employeeDetails[1];
		System.out.println(name);
		System.out.print("Enter employee designation: ");
		String designation = employeeDetails[2];
		System.out.println(designation);
		System.out.print("Enter employee salary: ");
		double salary = Double.parseDouble(employeeDetails[3]);
		System.out.println(salary);
		
		employee = new Employee(id, name, designation, salary);
		
		System.out.println("Emplooyee Management System."
				+ "\n1. Increment salary"
				+ "\n2. Inreament salary with bonus"
				+ "\n3. Display employee details"
				+ "\n4. Exit");
		
		while(true)
		{
			int choice;
			String[] array = bf.readLine().split(" ");
			System.out.print("Enter your choice: ");
			choice = Integer.parseInt(array[0]);
			System.out.println(choice);
			
			switch(choice)
			{
				case 1:
					System.out.print("Enter the percentage of salary increament: ");
					double percentage = Double.parseDouble(array[1]);
					System.out.println(percentage);
					employee.increaseSalary(percentage);
					break;
				case 2:
					System.out.print("Enter the percentage of salary increament: ");
					percentage = Double.parseDouble(array[1]);
					System.out.println(percentage);
					System.out.print("Enter the bonus: ");
					double bonus = Double.parseDouble(array[1]);
					System.out.println(bonus);
					employee.increaseSalary(percentage, bonus);
					break;
				case 3:
					System.out.println(employee.displayInfo());
					break;
				case 4:
					System.out.println("Thank you!");
					return;
				default:
					System.out.println("Invalid Input. Try again.");
			}
		}
		
	}
}
