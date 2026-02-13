package com.javabasics;

public class TypePromotion {
	public static void main(String args[])
	{
		byte b = 50;
		b = (byte) (b*2); //type promotion from byte to int
		System.out.println("Byte Value: "+b);
	}
}
