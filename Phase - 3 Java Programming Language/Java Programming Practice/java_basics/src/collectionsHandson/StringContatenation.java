package collectionsHandson;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StringContatenation {
	public static void main(String args[])
	{
		Set<String> set = new HashSet<>();
		
		set.add("Java");
		set.add("Hello");
		set.add("Programming");
		set.add("World");
		
		String ans = "";
		
		Iterator<String> itr = set.iterator();
		
		while(itr.hasNext())
		{
			String temp = itr.next();
			System.out.println("Elements in the Set : "+temp);
			ans = ans +" "+temp;
		}
		
		System.out.println("Concatenated Result : "+ans);
	}
}
