package functions_hands_on;

import java.util.*;

public class AppraisalCalculation {
	
	public static float findNewSalary(float salary, float appraisal)
	{
		float hike = 0;
		if(appraisal >= 1 && appraisal <= 4) hike = 10;
		else if(appraisal >= 4.1 && appraisal <= 7) hike = 25;
		else if(appraisal >= 7.1 && appraisal <= 10) hike = 30;
		return salary + salary*hike/100;
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the salary: ");
		float salary = sc.nextFloat();
		
		if(salary <= 0)
		{
			System.out.println("Invalid Input");
			return;
		}
		
		System.out.print("Enter the appraisal rating: ");
		float appraisal = sc.nextFloat();
		
		if(appraisal <= 0 || appraisal > 10)
		{
			System.out.println("Invalid Input");
			return;
		}
		
		float newSalary = findNewSalary(salary, appraisal);
		
		System.out.println("Your new salary is: "+newSalary);
	}
}
