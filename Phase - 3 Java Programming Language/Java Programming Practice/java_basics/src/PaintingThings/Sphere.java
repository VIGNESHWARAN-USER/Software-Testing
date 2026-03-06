package PaintingThings;

public class Sphere extends Shape{
	private double radius;
	private double surfaceArea;
	
	public Sphere(double radius)
	{
		super("Sphere");
		this.radius = radius;
	}
	
	public double area()
	{
		return 4*Math.PI*radius*radius;
	}
}
