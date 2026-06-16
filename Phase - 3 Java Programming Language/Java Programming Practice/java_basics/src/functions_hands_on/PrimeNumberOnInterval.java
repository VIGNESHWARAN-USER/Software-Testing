package functions_hands_on;

import java.util.*;

public class PrimeNumberOnInterval {
	public static boolean isPrime(int n)
	{
		if(n < 2) return false;
		
		for(int i=2; i<=Math.sqrt(n); i++)
		{
			if(n%i == 0) return false;
		}
		
		return true;
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the lower bound: ");
		int lb = sc.nextInt();
		
		System.out.print("Enter the upper bound: ");
		int ub = sc.nextInt();
		
		if(lb > ub)
		{
			System.out.println("Provide valid input.");
			return;
		}
		
		System.out.println("The prime numbers between "+lb+" to "+ub+" are: ");
		for(int i=lb; i<=ub; i++)
		{
			if(isPrime(i))
			{
				System.out.print(i+" ");
			}
		}
	}
}
