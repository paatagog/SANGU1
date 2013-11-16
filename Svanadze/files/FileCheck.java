package Svanadze.files;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileCheck {

	public static String INPUT_FILE_A = "c:/java/sources/Svanadze/files/afile.txt";
	public static String INPUT_FILE_B = "c:/java/sources/Svanadze/files/bfile.txt";
	public static String OUTPUT_FILE = "c:/java/sources/Svanadze/files/resultfile.txt";

	public static void main(String[] args) {
		try {
			List<String> lines1 = Files.readAllLines(Paths.get(INPUT_FILE_A),
					Charset.forName("UTF-8"));
			List<String> lines2 = Files.readAllLines(Paths.get(INPUT_FILE_B),
					Charset.forName("UTF-8"));
			List<String> lines = new ArrayList<String>();

			File file = new File(OUTPUT_FILE);
			PrintWriter out = new PrintWriter(new FileWriter(file));

			lines.addAll(lines1);
			lines.addAll(lines2);

			for (String line1 : lines1) {
				for (String line2 : lines2) {
					if (line1.equals(line2)) {
						lines.remove(line1);
					}
				}
			}
			
			for (String s : lines) {
				out.println(s);
			}
			
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
