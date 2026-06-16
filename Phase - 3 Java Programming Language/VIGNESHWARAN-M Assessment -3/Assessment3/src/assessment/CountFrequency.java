package assessment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;

public class CountFrequency {
	public static void main(String args[])
	{
		try
		{
			BufferedReader bf = new BufferedReader(new FileReader("src/assessment/word.txt"));
			
			HashMap<String , Integer> hm = new HashMap<>();
			HashSet<String> set = new HashSet();
			
			String val;
			
			while((val = bf.readLine()) != null)
			{
				String[] array = val.split(" ");
				
				for(String i: array)
				{
					hm.put(i, hm.getOrDefault(i, 0)+1);
					set.add(i);
				}
			}
			
			for(String i: hm.keySet())
			{
				System.out.println(i+" : "+hm.get(i));
			}
			
			System.out.println("Unique words: "+set.size());
		}
		catch (IOException e) {
			System.out.println("word.txt not found");
		}
		
	}
}
