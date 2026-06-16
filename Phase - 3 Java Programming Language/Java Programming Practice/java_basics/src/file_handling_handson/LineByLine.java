package file_handling_handson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LineByLine {
	
	public static void main(String args[]) throws IOException
	{
		BufferedReader bf = new BufferedReader(new FileReader("src/file_handling_handson/input.txt"));
		
		String temp = bf.readLine();
		
		StringBuilder sb = new StringBuilder("");
		
		while(temp != null)
		{
			sb.append(temp);
			sb.append("\n");
			temp = bf.readLine();
		}
		
		
		System.out.println("The content in the file is: \n"+sb.toString());
	}
}
