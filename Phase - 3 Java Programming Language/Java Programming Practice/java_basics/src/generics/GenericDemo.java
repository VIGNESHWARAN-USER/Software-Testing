package generics;

class Demo<T>
{
	private T t;
	
	public void set(T t)
	{
		this.t = t;
	}
	
	public T get()
	{
		return t;
	}
}

public class GenericDemo {
	public static void main(String args[])
	{
		Demo<Integer> iObj = new Demo<>();
		
		iObj.set(25);
		System.out.println("Integer Object : "+iObj.get());
		
		Demo<String> sObj = new Demo<>();
		
		sObj.set("Demo");
		System.out.println("Integer Object : "+sObj.get());
	}
}
