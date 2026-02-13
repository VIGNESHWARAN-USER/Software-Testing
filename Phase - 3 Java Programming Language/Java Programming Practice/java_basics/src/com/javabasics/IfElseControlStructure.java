package com.javabasics;

public class IfElseControlStructure {
	public static void main(String args[])
	{
		int currentSpeed = 10;
		boolean isMoving = true;
		if(isMoving)
		{
			currentSpeed--;
			System.out.println("Speed got reduced");
		}
		else
		{
			System.out.println("Vehicle already stopped");
		}
	}
}
