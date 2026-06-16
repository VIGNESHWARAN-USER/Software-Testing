package arrays_hand_on;

import java.util.*;

public class MaximumElementIn2D {
	
	public static int findMax(int[][] arr, int row, int col)
	{
		int max = arr[0][0];
		for(int i = 0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				if(max < arr[i][j]) max = arr[i][j];
			}
		}
		return max;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the row size: ");
		int row = sc.nextInt();
		System.out.print("Enter the column size: ");
		int col = sc.nextInt();
		int[][] arr = new int[row][col];
		System.out.println("Enter the elements:");
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		int max = findMax(arr, row, col);
		System.out.println("The maximum value is: "+max);
	}
}
