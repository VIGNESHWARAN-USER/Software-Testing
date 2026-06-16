package java_fundamentals_assessment;

import java.util.*;

public class DingDong {
	
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
		
		for(int i=lb; i<=ub; i++)
		{
			if(i%10 == 0)
			{
				System.out.print("dong ");
			}
			else if(i%5 == 0)
			{
				System.out.print("ding ");
			}
			else
			{
				System.out.print(i+" ");
			}
		}
	}
}
