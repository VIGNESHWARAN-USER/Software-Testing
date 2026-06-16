package java_fundamentals_assessment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class LuckyDraw {
	
	public static int findSumDigit(int num)
	{
		int sum = 0;
		while(num > 0)
		{
			sum += num%10;
			num/=10;
			if(sum > 0)
			{
				int temp = sum;
				sum = 0;
				while(temp >0)
				{
					sum += temp%10;
					temp/=10;
				}
			}
		}
		return sum;
	}
	
	public static void main(String args[]) throws IOException
	{
		BufferedReader bf = new BufferedReader(new FileReader("src/java_fundamentals_assessment/LuckyDraw.txt"));
		
		int n = Integer.parseInt(bf.readLine());
		
		System.out.print("No. of Participants: ");
		System.out.println(n);
		
		String[] array = bf.readLine().split(" ");
		int[] arr = new int[n];
		System.out.print("Token Number for "+n+" participants: ");
		for(int i=0; i<n; i++)
		{
			arr[i] = Integer.parseInt(array[i]);
			System.out.print(arr[i]+" ");
			if(arr[i] < 1000 || arr[i] > 9999)
			{
				System.out.println("Invalid Input");
			}
		}
		int firstPrize = 0, secondPrize = 0, thirdPrize = 0;
		for(int i=0; i<n; i++)
		{
			int val = findSumDigit(arr[i]);
			if(val == 7)
			{
				firstPrize = arr[i];
			}
			else if(val == 5)
			{
				secondPrize = arr[i];
			}
			else if(val == 3)
			{
				thirdPrize = arr[i];
			}
		}
		System.out.println("\nFirst Prize is to token: "+firstPrize);
		System.out.println("Second Prize is to token: "+secondPrize);
		System.out.println("Third Prize is to token: "+thirdPrize);
	}
}
