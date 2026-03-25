package assessment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SubstringAndConcatenation {
	public static void main(String args[]) throws IOException
	{
		BufferedReader bf = new BufferedReader(new FileReader("src/assessment/input.txt"));
		
		System.out.print("Enter the String: ");
		String val = "";
		val = val + bf.readLine();
		System.out.println(val);
		
		if(val.length() < 2)
		{
			val = val + "@@"
					;
		}
		
		System.out.println("The substring is: "+val.substring(0, 2));
	}
}
