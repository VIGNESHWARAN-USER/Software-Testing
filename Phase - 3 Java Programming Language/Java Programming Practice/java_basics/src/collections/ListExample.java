package collections;

import java.util.List;

public class ListExample {
	public static void main(String args[])
	{
		try {   System.out.println("try");   throw new RuntimeException("err"); } 
		catch (Exception e) {   System.out.println("catch"); } 
		finally {   System.out.println("finally"); }
	}
}
