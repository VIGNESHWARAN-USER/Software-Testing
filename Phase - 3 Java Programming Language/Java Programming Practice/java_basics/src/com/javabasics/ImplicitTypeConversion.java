package com.javabasics;

public class ImplicitTypeConversion {
	public static void main(String args[])
	{
		int i = 100;
		long l = i;	//Implicit type conversion from int to long
		float f = l; //Implicit type conversion from long to double
		System.out.println("Int value: "+i);
		System.out.println("Float value: "+l);
		System.out.println("Long value: "+f);
	}
}
