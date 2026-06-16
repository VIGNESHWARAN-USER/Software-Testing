package com.javabasics;

public class NestedIfControlStructure {
	public static void main(String args[])
	{
		int age = 15;
		int weight = 50;
		if(age > 18)
		{
			if(weight > 50)
			{
				System.out.println("You are eligible to donate blood");
			}
			else
			{
				System.out.println("You are not eligible because you are under weight");
			}
		}
		else
		{
			System.out.println("You are not eligible because you are under ");
		}
	}
}
