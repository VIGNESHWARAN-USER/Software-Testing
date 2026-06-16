package com.java_arrays;

public class ArrayDemo1 {
	public static void main(String args[])
	{
		int[] arr = new int[3];
		arr[1] = 5;
		arr[2] = 8;
		for(int i: arr)
		{
			System.out.print(i+" ");
		}
	}
}
