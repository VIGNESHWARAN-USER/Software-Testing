package arrays_hand_on;

import java.util.*;

public class MaximumElement {
	
	public static int findMax(int[] arr, int row)
	{
		int max = arr[0];
		for(int i = 0; i<row; i++)
		{
			if(max < arr[i]) max = arr[i];
		}
		return max;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int row = sc.nextInt();
		int[] arr = new int[row];
		System.out.println("Enter the elements:");
		for(int i=0; i<row; i++)
		{
			arr[i] = sc.nextInt();
		}
		int max = findMax(arr, row);
		System.out.println("The maximum value is: "+max);
	}
}
