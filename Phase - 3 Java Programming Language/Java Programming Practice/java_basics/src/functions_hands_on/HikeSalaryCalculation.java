package functions_hands_on;

import java.util.*;

public class HikeSalaryCalculation {
	
	public static float findNewSalary(float salary, float hike)
	{
		return salary + salary*hike/100;
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the salary per month: ");
		float salary = sc.nextFloat();
		
		System.out.print("Enter the hike percentage: ");
		float hike = sc.nextFloat();
		
		float newSalary = findNewSalary(salary, hike);
		
		System.out.println("Your new salary is: "+newSalary);
	}
}
