package iostream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {
	public static void main(String args[]) throws IOException
	{
		FileOutputStream fr = new FileOutputStream("src/iostream/stream.ser");
		ObjectOutputStream or = new ObjectOutputStream(fr);
		
		Employee emp = new Employee(1, "Vignesh");
		
		or.writeObject(emp);
		
		fr.close();
		or.close();
		
		System.out.println("Object written successfully.");
	}
}
