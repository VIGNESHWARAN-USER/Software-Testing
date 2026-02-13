package com.javabasics;
import java.util.Scanner;	//Import Scanner class from util package
public class ReadSomeInput {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in); //Creating object for Scanner class.
		String name = sc.next();	//Getting input from the user
		System.out.println("Hi "+name+", Welcome to the training program");
	}
}
