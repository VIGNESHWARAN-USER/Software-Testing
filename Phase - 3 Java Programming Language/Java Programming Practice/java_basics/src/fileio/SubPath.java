package fileio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class SubPath {
	public static void main(String args[])
	{
		Path p1 = Paths.get("D:\\EXPLEO SMARTCLIFF\\Phase - 3 Java Programming Language\\Study Materials\\1.Class_Object_Encapsulation_V1.0 1.pdf");
		
		Path p2 = p1.subpath(1, 3);
		
		System.out.println(p1);
		System.out.println(p2);
	}
}
