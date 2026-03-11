package string.practice;

public class StringsExample {
	public static void concat1(String s1)
	{
		s1 = s1 + " Ram"; 
	}
	
	public static void concat2(StringBuilder s2)
	{
		s2.append(" Raj");
	}
	
	public static void concat3(StringBuffer s3)
	{
		s3.append(" Ravi");
	}
	
	public static void main(String args[])
	{
		String s1 = new String("Hey");
		concat1(s1);
		
		StringBuilder s2 = new StringBuilder("Hi,");
		concat2(s2);
		
		StringBuffer s3 = new StringBuffer("Hi,");
		concat3(s3);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}
