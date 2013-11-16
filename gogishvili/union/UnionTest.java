package gogishvili.union;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class UnionTest {

	public static String INPUT_FILE_A = "c:/java/sources/Svanadze/files/afile.txt";
	public static String INPUT_FILE_B = "c:/java/sources/Svanadze/files/bfile.txt";
	public static String OUTPUT_FILE  = "c:/java/sources/Svanadze/files/resultfile.txt";

	private static void log(String message) {
		System.out.println(new Date() + ": " + message);
	}

	public static void main(String[] args) {
		try {
			Set<String> s = new HashSet<String>();

			log("Reading First File - " + INPUT_FILE_A);
			s.addAll(Files.readAllLines(Paths.get(INPUT_FILE_A), Charset.forName("UTF-8")));
			log("Reading Second File - " + INPUT_FILE_B);
			s.addAll(Files.readAllLines(Paths.get(INPUT_FILE_B), Charset.forName("UTF-8")));

			log("Writing To The Result File - " + OUTPUT_FILE);
			PrintWriter out = new PrintWriter(new FileWriter(new File(OUTPUT_FILE)));

			for (String st : s) {
				out.println(st);
			}
			
			out.close();
			log("Ok!");
		} catch (Exception e) {
			log("File Read Error");
		}
	}


}
