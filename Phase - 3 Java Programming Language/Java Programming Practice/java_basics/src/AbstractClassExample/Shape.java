package AbstractClassExample;

public abstract class Shape {
	public void draw()
	{
		System.out.println("Drawing");
	}
	
	abstract void area();
	abstract void perimeter();
}

