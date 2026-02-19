package java_fundamentals_assessment;

import java.util.*;
public class PerfectNumber {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int val = sc.nextInt();
		int sum = 0;
		for(int i=1; i<val; i++)
		{
			if(val%i == 0) sum+=i;
		}
		if(sum == val)
		{
			System.out.println("The given number is perfect");
		}
		else
		{
			System.out.println("The given number is not perfect");
		}
	}
}
