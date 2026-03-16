package iostream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
	public static void main(String args[]) throws IOException
	{
		String data = "Hello, I am Vigneshwaran...";
		
		FileOutputStream fp = new FileOutputStream("src/iostream/input.txt");
		
		byte[] array = data.getBytes();
		
		fp.write(array);
		System.out.println("Success");
		
		fp.close();
	}
}
