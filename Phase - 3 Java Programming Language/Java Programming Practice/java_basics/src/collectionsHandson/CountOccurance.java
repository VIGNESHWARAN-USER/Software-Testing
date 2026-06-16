package collectionsHandson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;

public class CountOccurance {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new FileReader("src/collectionsHandson/CountOccurance.txt"));
		
		char[] array = bf.readLine().toCharArray();
		
		HashMap<Character, Integer> hm = new HashMap<>();
		
		for(char i: array)
		{
			hm.put(i, hm.getOrDefault(i, 0)+1);
		}
		
		for(Entry<Character, Integer> i: hm.entrySet())
		{
			System.out.println(i.getKey()+" "+i.getValue());
		}
		
	}

}
