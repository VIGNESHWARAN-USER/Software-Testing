package com.oops;

class Vehicle
{
	void run()
	{
		System.out.println("Vehicle is running");
	}
}

class Truck extends Vehicle
{
	void run()
	{
		System.out.println("Truck is running");
	}
	
	void display()
	{
		System.out.println("Truck is running");
	}
}

public class MethodOverriding {
	public static void main(String args[])
	{
		Vehicle obj = new Truck();
		obj.run();
	}
}
