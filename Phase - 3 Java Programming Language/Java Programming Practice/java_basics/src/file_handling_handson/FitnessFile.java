package file_handling_handson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class FitnessFile {
	
	public static void main(String args[]) throws IOException
	{
		BufferedReader bf = new BufferedReader(new FileReader("src/file_handling_handson/fitness.txt"));
		
		String temp = bf.readLine();
		temp = bf.readLine();
		
		
		
		while(temp != null)
		{
			String[] report = temp.split("\\s+");
			String res = "";
			res = (Integer.parseInt(report[1]) < 90 || Integer.parseInt(report[1]) > 110) ? "Abnormal" : "Normal"; 
			System.out.println("The sugar leven on "+report[0]+" is "+res);
			temp = bf.readLine();
		}
	}
}
