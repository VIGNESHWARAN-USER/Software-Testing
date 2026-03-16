package java_fundamentals_assessment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class DingDong {
	
	public static void main(String args[]) throws IOException
	{
		
		BufferedReader bf = new BufferedReader(new FileReader("src/java_fundamentals_assessment/DingDong.txt"));
		
		String[] array = bf.readLine().split(" ");
		
		int lb = Integer.parseInt(array[0]);
		int ub = Integer.parseInt(array[1]);
		
		System.out.print("Enter the lower bound: ");
		
		System.out.println(lb);
		
		System.out.print("Enter the upper bound: ");
		
		System.out.println(ub);
		
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
