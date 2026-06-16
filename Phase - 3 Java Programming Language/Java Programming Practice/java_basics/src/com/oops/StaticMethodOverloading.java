package com.oops;

class Demo
{
	static int add(int a, int b)
	{
		return a+b;
	}
	
	static int add(int a, int b, int c)
	{
		return a+b+c;
	}
}

public class StaticMethodOverloading {
	public static void main(String args[])
	{
		System.out.println("Addition of two numbers: "+Demo.add(5, 10));
		System.out.println("Addition of three numbers: "+Demo.add(5, 10, 15));
	}
}
