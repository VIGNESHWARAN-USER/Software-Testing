package AbstractClassExample;

public class Circle extends Shape{
	
	public static final float PI = 3.14f;
	int radius;
	
	public Circle(int r)
	{
		radius = r;
	}
	
	public void area()
	{
		float area = radius*radius*PI;		
		System.out.println("The area is: "+area);
	}
	
	public void perimeter()
	{
		float perimeter = 2*PI*radius;
		System.out.println("The perimeter is: "+perimeter);
	}

}
