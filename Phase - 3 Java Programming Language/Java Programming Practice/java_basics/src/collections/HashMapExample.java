package collections;

import java.util.*;
import java.util.Map.Entry;

public class HashMapExample {
	public static void main(String args[])
	{
		HashMap<String, Double> hm = new HashMap<>();
		
		hm.put("A", 1.1);
		hm.put("B", 2.2);
		hm.put("F", 3.3);
		hm.put("E", 4.4);
		
		hm.put("D", 6.6);
		hm.put("C", 5.5);
		hm.put("F", 3.3);
		for(Entry<String, Double> i: hm.entrySet())
		{
			System.out.println(i.getKey()+" "+i.getValue());
		}
	}
}
