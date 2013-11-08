package lukino;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileInput {

	public static String INPUT_FILE = "D:/Lukino/sources/lukino/fileinput.txt";
	
	public static void main(String[] args) {
		try {
			List<String> lists = Files.readAllLines(Paths.get(INPUT_FILE), Charset.forName("UNICODE"));
			for (String line : lists)
				System.out.println(line);
		}
		
		catch(IOException e){
			e.printStackTrace();				
		}
		
	}

}
