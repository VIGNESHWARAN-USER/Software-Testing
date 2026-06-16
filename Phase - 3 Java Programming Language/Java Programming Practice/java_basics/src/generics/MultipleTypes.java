package generics;

class Test<T, U, R>
{
	private T t;
	private U u;
	private R r;
	
	public Test(T t, U u, R r)
	{
		this.t = t;
		this.r = r;
		this.u = u;
	}
	
	public void display()
	{
		System.out.println("T : "+t);
		System.out.println("U : "+u);
		System.out.println("R : "+r);
	}
}

public class MultipleTypes {
	public static void main(String args[])
	{
		Test<Integer, Float, String> obj = new Test<>(1, 2.0f, "Hello");
		obj.display();
	}
}
