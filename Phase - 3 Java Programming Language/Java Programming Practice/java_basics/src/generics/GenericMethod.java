package generics;

public class GenericMethod {
	
	static <T> void genericDisplay(T t)
	{
		System.out.println(t.getClass().getName()+" = "+t);
	}
	
	public static void main(String args[])
	{
		genericDisplay(11);
		genericDisplay(11.0);
		genericDisplay("Hello");
	}
}
