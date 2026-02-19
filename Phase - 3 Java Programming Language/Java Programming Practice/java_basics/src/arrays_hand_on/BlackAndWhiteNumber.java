package arrays_hand_on;

import java.util.*;

public class BlackAndWhiteNumber {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<>();
		
		System.out.println("Enter the values of the array.");
		while(true)
		{
			int val = sc.nextInt();
			if(val < 0) break;
			arr.add(val);
		}
		for(int i=0; i<arr.size(); i++)
		{
			if(arr.get(i)%7 == 0 && arr.get(i)%8 == 0)
			{
				arr.set(i, -6);
			}
			else if(arr.get(i)%7 == 0)
			{
				arr.set	(i, -2);
			}
			else if(arr.get(i)%8 == 0)
			{
				arr.set(i, -9);
			}
		}
		for(int i: arr)
		{
			System.out.print(i+" ");
		}
	}
}
