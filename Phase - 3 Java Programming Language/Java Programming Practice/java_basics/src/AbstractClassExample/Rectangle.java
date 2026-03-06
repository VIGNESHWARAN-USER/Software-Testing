package AbstractClassExample;

public class Rectangle extends Shape{
	
	int length, breath;
	
	public Rectangle(int l, int b)
	{
		length = l;
		breath = b;
	}
	
	public void area()
	{
		int area = length*breath;		
		System.out.println("The area is: "+area);
	}
	
	public void perimeter()
	{
		int perimeter = 2*(length*breath);
		System.out.println("The perimeter is: "+perimeter);
	}
}
