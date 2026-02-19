package java_fundamentals_assessment;

import java.util.*;

public class ProcessingScore {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> scores = new ArrayList<>();
		
		System.out.println("Enter the scores (enter a negative number to stop input)");
		while(true)
		{
			int val = sc.nextInt();
			if(val < 0) break;
			scores.add(val);
		}
		for(int i=0;i<scores.size(); i++)
		{
			int temp = scores.get(i); 
			
			if(temp%2 == 0)
			{
				scores.set(i, 0);
			}
			if(temp%2 == 1)
			{
				scores.set(i, 1);
			}
			if(temp%8 == 0)
			{
				scores.set(i, 2);
			}
			if(temp%10 == 3)
			{
				scores.set(i, 3);
			}
			if(temp%9 == 0)
			{
				scores.set(i, 4);
			}
		}
		
		System.out.println("The scores after processing are: ");
		for(int i: scores)
		{
			System.out.print(i+" ");
		}
	}
}
