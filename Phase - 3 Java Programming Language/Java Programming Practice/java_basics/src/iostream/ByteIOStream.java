package iostream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteIOStream {
	public static void main(String args[]) throws IOException
	{
		FileInputStream fis = new FileInputStream("src/iostream/input.txt");
		FileOutputStream fos = new FileOutputStream("src/iostream/output.txt");
		
		byte[] b = new byte[5];
		
		int read = 0, count = 0;
		
		System.out.println("Available : "+fis.available());
		
		while((read = fis.read(b)) != -1)
		{
			fos.write(b);
			System.out.println(Arrays.toString(b));
			count += read;
		}
		
		System.out.println("File written successfully..");
		System.out.println("Count : "+count);
	}
}
