package java_fundamentals_assessment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class ProcessingScore {
	public static void main(String args[]) throws IOException
	{
		BufferedReader bf = new BufferedReader(new FileReader("src/java_fundamentals_assessment/ProcessingScore.txt"));
		
		String[] array = bf.readLine().split(" ");
		
		ArrayList<Integer> scores = new ArrayList<>();
		
		int x = 0;
		
		System.out.println("Enter the scores (enter a negative number to stop input)");
		while(true)
		{
			int val = Integer.parseInt(array[x]);
			System.out.println(val);
			if(val < 0) break;
			scores.add(val);
			
			x++;
		}
		
		System.out.println("The scores before processing are: ");
		for(int i: scores)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		
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
