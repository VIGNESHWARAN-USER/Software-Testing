package generics;

import java.util.*;

public class Wildcard {
	
	public static double sum(List<? extends Number> list)
	{
		double sum = 0;
		for(Number i : list)
		{
			sum += i.doubleValue();
		}
		
		return sum;
	}
	
	public static void main(String args[])
	{
		List<Float> arr = new ArrayList<>();
		
		arr.add(1.1f);
		arr.add(2.2f);
		arr.add(3.1f);
		arr.add(4.1f);
		arr.add(5.2f);
		
		double sum = sum(arr);
		
		System.out.println("The sum is : "+sum);
	}
}
