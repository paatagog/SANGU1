package kvizhinadze;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FilesReadTest {
	public static String INPUT_FILES = "D:/kvizhinadze/java/Sangu/sources/input.txt";
	
	public static void main(String[] args){
		try{
			List<String> lines = Files.readAllLines(Paths.get(INPUT_FILES), Charset.forName("UTF-8"));
			for(String line:lines){
				System.out.println(line);
			}
		} catch (IOException e){
			e.printStackTrace();
		}
		
	}
}
