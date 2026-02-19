package arrays_hand_on;

import java.util.*;

public class SharingChocolate {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of persons in the group: ");
		int n = sc.nextInt();
		int[] chocolates = new int[n];
		
		for(int i = 0; i < n; i++)
		{
			System.out.print("Enter number of chocolates from person "+(i+1)+": ");
			chocolates[i] = sc.nextInt();
		}
		
		int sum = 0;
		
		for(int i = 0; i < n; i++)
		{
			sum += chocolates[i];
		}
		
		if(sum%n == 0)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}
}
