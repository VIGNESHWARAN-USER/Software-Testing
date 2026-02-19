package arrays_hand_on;

import java.util.*;

public class FindMissingNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[100];
		System.out.println("Enter the elements from 1 to 100");
		for(int i=0; i<100; i++)
		{
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		for(int i: arr)
		{
			sum += i;
		}
		int expectedSum = 100*101/2;
		System.out.println("The missing element is: "+(expectedSum - sum));
	}
}
