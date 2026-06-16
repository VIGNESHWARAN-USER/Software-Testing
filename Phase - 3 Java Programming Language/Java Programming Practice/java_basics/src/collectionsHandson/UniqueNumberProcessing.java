package collectionsHandson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;

public class UniqueNumberProcessing {
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		BufferedReader bf = new BufferedReader(new FileReader("src/collectionsHandson/UniqueNumberProcessing.txt"));
		
		TreeSet<Integer> set = new TreeSet<>();
		
		int sum = 0, low = Integer.MAX_VALUE, high = Integer.MIN_VALUE, count = 0;
		
		while(true)
		{
			System.out.print("Enter a number (or type 'done' to finish): ");
			String val = bf.readLine();
			if(val.equals("done")) break;
			int intVal = Integer.parseInt(val);
			set.add(intVal);
			System.out.println(val);
			count++;
			sum += intVal;
			
			if(low > intVal) low = intVal;
			
			if(high < intVal) high = intVal;
			
		}
		
		System.out.println("Sorted unique numbers : "+set);
		System.out.println("Average : "+(float)sum/count);
		System.out.println("Lowest : "+low);
		System.out.println("Highest : "+high);
		System.out.print("Odd numbers : "	);
		for(int i : set)
		{
			if(i%2 == 1) System.out.print(i+" ");
		}
		
	}
}
