package NestedClass;

class Person
{
	int age = 21;
	
	public void outerDisplay()
	{
		System.out.println("This is outer class");
	}
	
	 static class Gender
	 {
		 public void nonStaticDisplay()
		 {
			 System.out.println("This is a non-static method");
		 }
		 
		 public static void staticDisplay()
		 {
			 System.out.println("This is a static method");
		 }
	 }
	 
	 Gender gender = new Gender();
}

public class StaticClassExample {
	public static void main(String args[])
	{
		Person person = new Person();
		
		person.gender.nonStaticDisplay();
		
		Person.Gender.staticDisplay();
	}
	
}
