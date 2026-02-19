package functions_hands_on;

import java.util.*;

public class RunningOddEvenSum {
	
	public static void printOddEvenSum(int lb, int ub)
	{
		int oddSum = 0, evenSum = 0;
		for(int i = lb; i<=ub; i++)
		{
			if(i%2 == 0) evenSum += i;
			else oddSum += i;
		}
		System.out.println("The sum of odd numbers from +"+lb+" to "+ub+" is: "+oddSum);
		System.out.println("The sum of even numbers from +"+lb+" to "+ub+" is: "+evenSum);
		System.out.println("The absolute difference between the two sums is: "+Math.abs(oddSum-evenSum));
		
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the lower bound: ");
		int lb = sc.nextInt();
		
		System.out.print("Enter the upper bound: ");
		int ub = sc.nextInt();
		
		printOddEvenSum(lb, ub);
	}
}
