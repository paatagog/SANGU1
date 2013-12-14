package Svanadze.slprocessor;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ProcessTest {
	
	private static String INPUT_FILE = "c:/JAVA/sources/Svanadze/slprocessor/input.txt";
	private static String RESULT_FILE = "c:/JAVA/sources/Svanadze/slprocessor/result.txt";
	
	public static void main(String[] args) {
		try {
			PrintWriter out = new PrintWriter(new File(RESULT_FILE));
			out.println(SLProcessor.process(Files.readAllLines(Paths.get(INPUT_FILE),Charset.forName("UTF-8"))));
			out.close();
		} catch (IOException ioex) {
			ioex.printStackTrace();
		}
	}
}
