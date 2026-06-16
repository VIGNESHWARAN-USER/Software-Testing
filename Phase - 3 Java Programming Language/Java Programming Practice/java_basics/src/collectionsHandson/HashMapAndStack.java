package collectionsHandson;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Stack;

public class HashMapAndStack {
	
	public static void pushToppers(Stack<String> toppers, HashMap<String, Integer> marks)
	{
		for(Entry<String, Integer> i : marks.entrySet())
		{
			if(i.getValue() > 75)
			{
				toppers.push(i.getKey());
			}
		}
	}
	
	public static void popAndDisplay(Stack<String> toppers)
	{
		while(!toppers.isEmpty())
		{
			System.out.println(toppers.pop());
		}
	}
	
	public static void main(String args[])
	{
		
		HashMap<String, Integer> marks = new HashMap<>();
		
		marks.put("Mano", 85);
		marks.put("Shan", 85);
		marks.put("John", 55);
		marks.put("Anu", 60);
		marks.put("Aju", 90);
		marks.put("Frank", 80);
		
		Stack<String> toppers = new Stack<>();
		
		pushToppers(toppers, marks);
		
		popAndDisplay(toppers);
		
	}
}
