package iostream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {

	public static void main(String[] args) throws IOException {
			
		FileInputStream fp = new FileInputStream("src/iostream/input.txt");
		
		int val = fp.read();
		while(val != -1)
		{
			System.out.print((char)val);
			val = fp.read();
		}
		
		
	}

}
