package com.javabasics;

//OOPS USED: Class
public class ExplicitTypeConversion {
	public static void main(String args[])
	{
		double i = 100;
		long l = (long)i; //Explicit type conversion from double to long
		int f = (int)l;	//Explicit type conversion from long to int
		System.out.println("Int value: "+i);
		System.out.println("Float value: "+l);
		System.out.println("Long value: "+f);
	}
}
