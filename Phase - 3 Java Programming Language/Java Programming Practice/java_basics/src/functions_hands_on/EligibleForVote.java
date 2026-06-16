package functions_hands_on;

import java.util.*;

public class EligibleForVote {
	
	public static boolean isEligible(int age)
	{
		return age >= 18;
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the age: ");
		int age = sc.nextInt();
		
		if(isEligible(age))
		{
			System.out.println("You are eligible for vote");
		}
		else
		{
			System.out.println("You are not eligible for vote");
		}
	}
}
