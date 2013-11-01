package gogishvili.files;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileReadTest {
	public static String INPUT_FILE = "c:/input.txt";
	
	public static void main(String[] args) {
		 try {
	            List<String> lines = Files.readAllLines(Paths.get(INPUT_FILE), Charset.forName("UTF-8"));
	            for (String line : lines) {
	                System.out.println(line);
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }		
	}

}
