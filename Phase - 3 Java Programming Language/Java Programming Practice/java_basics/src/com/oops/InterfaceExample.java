package com.oops;

interface Shape
{
	double DEFAULT_VALUE = 1.0;
	
	double calculateArea();
	double calculatePerimeter();
	
	default void getDescription()
	{
		System.out.println("A Shape with unspecified dimension.");
	}
}

abstract class Circle implements Shape
{
	private double radius;
	
	public Circle(double radius)
	{
		this.radius = radius;
	}
	
	public Circle()
	{
		this.radius = DEFAULT_VALUE;
	}
	
	public double calculatePerimeter()
	{
		return 2*Math.PI*radius;
	}
	
	public void getDescription()
	{
		System.out.println("This is circle");
	}
	
}

class Rectangle implements Shape
{
	private double length, breath;
	
	public Rectangle(double length, double breath)
	{
		this.length = length;
		this.breath = breath;
	}
	
	public Rectangle()
	{
		this.length = DEFAULT_VALUE;
		this.breath = DEFAULT_VALUE;
	}
	
	public double calculateArea()
	{
		return length*breath;
	}
	
	public double calculatePerimeter()
	{
		return 2*length*breath;
	}
	
	public void getDescription()
	{
		System.out.println("This is rectangle");
	}
}

public class InterfaceExample {
	public static void main(String args[])
	{
//		Circle circle = new Circle();
		Rectangle rect = new Rectangle(10, 20);
		
		System.out.println(rect.calculateArea());
		System.out.println(rect.calculatePerimeter());
		rect.getDescription();
	}
}
