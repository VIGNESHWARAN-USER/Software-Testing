package fileio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

class CopyFileDirectory{
	public static void main(String args[]){
		Path source = Paths.get("F:\\Personal\\Training\\Example\\ArrayMethod.java");
		Path target = Paths.get("F:\\Personal\\Training\\Example\\Sample\\Test.java");
		try {
			System.out.println(source+"   "+ "Copied to:"+"   "+ Files.copy(source, 
					target,StandardCopyOption.REPLACE_EXISTING));
		}catch (IOException e) {
			System.out.println(e);        
		}
	}
}  