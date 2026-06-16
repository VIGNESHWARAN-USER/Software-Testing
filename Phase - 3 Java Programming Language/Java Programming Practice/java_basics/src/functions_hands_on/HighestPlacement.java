package functions_hands_on;

import java.util.*;

public class HighestPlacement {
	
	public static void printMaximumPlacedDept(int cs, int ec, int me)
	{
		if(cs > ec && cs > me)
		{
			System.out.println("Highest placement: CS");
		}
		else if(ec > cs && ec > me)
		{
			System.out.println("Highest placement: EC");
		}
		else if(me > ec && me > cs)
		{
			System.out.println("Highest placement: ME");
		}
		else
		{
			System.out.println("None of the department has got the highest placement");
		}
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the no of students placed in CS: ");
		int cs = sc.nextInt();
		System.out.print("Enter the no of students placed in EC: ");
		int ec = sc.nextInt();
		System.out.print("Enter the no of students placed in ME: ");
		int me = sc.nextInt();
		
		if(cs < 0 || ec < 0 || me < 0)
		{
			System.out.println("Invalid Input");
			return;
		}
		printMaximumPlacedDept(cs, ec, me);
	}
}
