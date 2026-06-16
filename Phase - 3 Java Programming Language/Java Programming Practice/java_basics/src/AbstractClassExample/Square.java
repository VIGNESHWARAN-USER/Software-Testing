package AbstractClassExample;

public class Square extends Shape{
	int side;
	public Square(int s)
	{
		side = s;
	}
	
	public void area()
	{
		int area = side*side;		
		System.out.println("The area is: "+area);
	}
	
	public void perimeter()
	{
		int perimeter = 2*side;
		System.out.println("The perimeter is: "+perimeter);
	}
}
