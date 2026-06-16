package NestedClass;

class OuterClass1
{
	public void outerClassMethod()
	{
		System.out.println("Inside the outer class");
		
		class InnerClass
		{
			public void innerClassMethod()
			{
				System.out.println("This is the inner class");
			}
		}
		
		InnerClass inner = new InnerClass();
		inner.innerClassMethod();
	}
}

public class MethodLocalInnerClass {
	public static void main(String args[])
	{
		OuterClass1 outer = new OuterClass1();
		outer.outerClassMethod();
	}
}
