package fileio;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class FileSystem1 {
	public static void main(String args[])
	{
		FileSystem fs = FileSystems.getDefault();
		
		Path p1 = fs.getPath("D:\\\\EXPLEO SMARTCLIFF\\\\Phase - 3 Java Programming Language\\\\Study Materials\\\\1.Class_Object_Encapsulation_V1.0 1.pdf");
		
		Path p2 = p1.subpath(2, 3);
		
		System.out.println(p1);
		System.out.println(p2);
	
	}
}
