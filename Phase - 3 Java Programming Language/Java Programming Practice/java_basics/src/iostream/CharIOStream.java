package iostream;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class CharIOStream {
	public static void main(String args[]) throws IOException
	{
		FileReader fis = new FileReader(args[0]);
		FileWriter fos = new FileWriter(args[1]);
		
		char[] b = new char[128];
		
		int read = 0, count = 0;
		
		
		while((read = fis.read(b)) != -1)
		{
			fos.write(b);
			System.out.println(Arrays.toString(b));
			count += read;
		}
		
		System.out.println("File written successfully..");
		System.out.println("Count : "+count);
		
		fos.close();
		fis.close();
	}
}
