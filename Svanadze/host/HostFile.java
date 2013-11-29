package Svanadze.host;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HostFile {
	
	public static String INPUT_FILE = "D:/JAVA/sources/Svanadze/host/hosts";
	public static String OUTPUT_FILE = "D:/JAVA/sources/Svanadze/host/result.txt";
	
	public static File file = new File(OUTPUT_FILE);
	public static PrintWriter out;
	
	public static void log(String message) {
		out.println(new Date() + ": " + message);
	}

	public static void main(String[] args) {
		try {
			IPCheck ipChecker = new IPCheck();
			GetRigthIP ipRight = new GetRigthIP();

			List<String> lines = Files.readAllLines(Paths.get(INPUT_FILE), Charset.forName("UTF-8"));

			List<String> rightIP = new ArrayList<String>();			
			
			out = new PrintWriter(new FileWriter(file));

			for (String line : lines) {
				if (!line.isEmpty() && !line.trim().startsWith("#")) {
					String[] arr = line.split("\\s+");
					if (!ipChecker.isMatch(arr[1], arr[0])) {
						arr[0] = ipRight.GetIP(arr[1]);
						rightIP.add(arr[0] + " " + arr[1]);
					}
				}
			}
			for (String s : rightIP) {			
				log(s);
			}
			
			out.close();
		} catch (IOException e) {
			log("ERROR");
		}
	}
}
