package AbstractClassExample;

public class MainMethod {
	public static void main(String args[])
	{
		Shape s;
		
		s = new Rectangle(10, 20);
		s.area();
		s.perimeter();
		
		s = new Square(20);
		s.area();
		s.perimeter();
		
		s = new Circle(10);
		s.area();
		s.perimeter();
	}
}
