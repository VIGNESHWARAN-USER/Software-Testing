package functions_hands_on;

import java.util.*;

public class EmployeeSalaryCalculation {
	
	public static int calculateSalary(int[] hours, int n)
	{
		int salary = 0;
		
		for(int i=0; i<n; i++)
		{
			if(hours[i] > 40)
			{
				salary += hours[i]*15;
			}
		}
		return salary;
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int[] hours = new int[5];
		
		for(int i=0; i<5; i++)
		{
			System.out.print("Enter the working hours of employee: "+(i+1)+" ");
			hours[i] = sc.nextInt();
		}
		
		int salary = calculateSalary(hours, 5);
		
		System.out.println("The Overtime pay for five employees is: "+salary);
	}
}
