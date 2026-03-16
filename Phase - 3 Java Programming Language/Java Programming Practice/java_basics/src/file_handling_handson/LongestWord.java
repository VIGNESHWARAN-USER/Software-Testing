package file_handling_handson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LongestWord {
	
	public static String findLongestWord(List<String> array)
	{
		int len = array.get(0).length(), index = 0;
		
		for(int i=1; i<array.size(); i++)
		{
			if(len < array.get(i).length())
			{
				index = i;
				len = array.get(i).length();
			}
		}
		return array.get(index);
	}
	
	public static void main(String args[]) throws IOException
	{
		BufferedReader bf = new BufferedReader(new FileReader("src/file_handling_handson/input.txt"));
		
		String temp = bf.readLine();
		
		List<String> val = new ArrayList<>();
		
		while(temp != null)
		{
			String[] tempArray = temp.split(" ");
			for(String i: tempArray)
			val.add(i);
			temp = bf.readLine();
		}
		
		String word = findLongestWord(val);
		
		System.out.println("The longest word is: "+word);
	}
}
