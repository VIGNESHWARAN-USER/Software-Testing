package NestedClass;

class OuterClass
{
	int age = 18;
	
	public void checkAge()
	{
		System.out.println("Check age method is accessed");
	}
	
	class InnerClass
	{
		public void display()
		{
			System.out.println("Inner class method.");
		}
	}
}

public class ObjectCreation {
	public static void main(String args[])
	{
		OuterClass outer = new OuterClass();
		outer.checkAge();
		
		OuterClass.InnerClass inner = outer.new InnerClass();
		
		inner.display();
	}
}
