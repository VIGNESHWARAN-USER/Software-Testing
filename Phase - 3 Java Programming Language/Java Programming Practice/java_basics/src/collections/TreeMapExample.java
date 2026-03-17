package collections;

import java.util.*;
import java.util.Map.Entry;

public class TreeMapExample {
	public static void main(String args[])
	{
		TreeMap<String, Double> hm = new TreeMap<>();
		
		hm.put("John Doe", 9.1);
		hm.put("Tom Smith", 2.2);
		hm.put("Jane Baker", 3.3);
		hm.put("Ralph Smith", 4.4);

		for(Entry<String, Double> i: hm.entrySet())
		{
			System.out.println(i.getKey()+" "+i.getValue());
		}
	}
}
