package collections;

import java.util.*;

public class VectorDemo {
	public static void main(String args[])
	{
		Vector<Integer> vector = new Vector<>(5, 8);
		
		System.out.println("Default Vector : "+vector);
		System.out.println("Default Capacity : "+vector.capacity());
		vector.add(5);
		vector.add(5);
		vector.add(5);
		vector.add(5);
		vector.add(5);
		vector.add(5);
		
		System.out.println("New Vector : "+vector);
		System.out.println("New Capacity : "+vector.capacity());
	}
}
