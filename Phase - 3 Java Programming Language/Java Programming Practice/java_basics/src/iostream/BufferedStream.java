package iostream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedStream {
	public static void main(String args[]) throws IOException
	{
		BufferedReader bfr = new BufferedReader(new FileReader("src/iostream/input.txt"));
		BufferedWriter bfw = new BufferedWriter(new FileWriter("src/iostream/output.txt"));
		
		String line = "";
		
		while((line = bfr.readLine())!= null)
		{
			bfw.write(line);
			bfw.newLine();
		}
		
		bfw.close();
		bfr.close();
		
		System.out.println("File written successfully.");
	}
}
