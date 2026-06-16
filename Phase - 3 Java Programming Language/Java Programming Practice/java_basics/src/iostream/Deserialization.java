package iostream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
	public static void main(String args[]) throws IOException, ClassNotFoundException
	{
		FileInputStream fr = new FileInputStream("src/iostream/stream.ser");
		ObjectInputStream or = new ObjectInputStream(fr);
		
		
		Employee emp = (Employee) or.readObject();
		
		fr.close();
		or.close();
		
		System.out.println("ID : "+emp.id);
		System.out.println("NAME : "+emp.name);
	}
}
