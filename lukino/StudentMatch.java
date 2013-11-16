package lukino;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Date;
import java.util.List;

public class StudentMatch {

	public static String INPUT_FILE1 = "D:/Lukino/sources/lukino/studentmatchinput1.txt";
	public static String INPUT_FILE2 = "D:/Lukino/sources/lukino/studentmatchinput2.txt";
	public static String OUTPUT_FILE = "D:/Lukino/sources/lukino/studentmatchoutput.txt";

	public static void log(String message){
		System.out.println(new Date() + ": " + message);
	}

	public static void main(String[] args) {
		try {
			List<String> lists1 = Files.readAllLines(Paths.get(INPUT_FILE1), Charset.forName("UNICODE"));
			List<String> lists2 = Files.readAllLines(Paths.get(INPUT_FILE2), Charset.forName("UNICODE"));
			
			File file = new File (OUTPUT_FILE);
			PrintWriter pW = new PrintWriter(new FileWriter(file));
			log("dsasdfadf");
			for (String line1 : lists1){
				for (String line2 : lists2){
					if (line2.equals(line1)){
						pW.println(line2);
						}
				}
			}
			
			pW.close();
		}
		
		catch(IOException e){
			log("File Read Error");
		}

	}

}
