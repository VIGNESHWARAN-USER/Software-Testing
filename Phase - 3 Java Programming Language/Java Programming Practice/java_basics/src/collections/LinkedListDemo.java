package collections;

import java.util.*;

public class LinkedListDemo {
	public static void main(String args[])
	{
		List<String> ll = new LinkedList<>();
		
		ll.add("C");
		ll.add("Python");
		ll.add("Java");
		ll.add("C#");
		ll.add("JavaScript");
		ll.add("Kotlin");
		
		System.out.println("Original List: "+ll);
		System.out.println("Size of the original List: "+ll.size());
		
		ll.remove(4);
		ll.remove("C#");
		
		System.out.println("List after deletion: "+ll);
		System.out.println("Size of the new List: "+ll.size());
	}
}
