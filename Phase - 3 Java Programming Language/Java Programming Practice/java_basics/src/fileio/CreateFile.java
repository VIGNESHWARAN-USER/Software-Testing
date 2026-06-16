package fileio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateFile{
	public static void main(String args[]){
		try{
			Path path1 = Paths.get("F:\\Personal\\Training\\Example\\Sample\\Sample.java");
			if(!Files.exists(path1)){
				Files.createFile(path1);
				System.out.println("Filecreated");
			}else{
				System.out.println("Filealreadyexists");
			}
		}catch (IOException e) {
		System.out.println(e); 
		}
	}
}