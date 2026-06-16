package collectionsHandson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LongerThanFive {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new FileReader("src/collectionsHandson/LongerThanFive.txt"));
		
		System.out.print("How many names do you want to input? ");
		int n = Integer.parseInt(bf.readLine());
		System.out.println(n);
		
		ArrayList<String> arr = new ArrayList<>();
		
		for(int i=0; i<n; i++)
		{
			String temp = bf.readLine();
			if(temp.length() > 5) arr.add(temp);
		}		
		for(String i: arr)
		{
			System.out.println(i);
		}
	}

}
