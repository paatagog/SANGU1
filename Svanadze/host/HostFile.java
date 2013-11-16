package Svanadze.host;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class HostFile {
	public static String INPUT_FILE = "D:/JAVA/sources/Svanadze/host/hosts";

	public static void main(String[] args) {
		try {
			IPCheck ipChecker = new IPCheck();
			GetRigthIP ipRight = new GetRigthIP();
			List<String> lines = Files.readAllLines(Paths.get(INPUT_FILE),
					Charset.forName("UTF-8"));
			for (String line : lines) {
				if (!line.isEmpty() && !line.trim().startsWith("#")) {
					String[] arr = line.split("\\s+");
					if (!ipChecker.isMatch(arr[1], arr[0])) {
						arr[0] = ipRight.GetIP(arr[1]);
						System.out.println(arr[0] + " " + arr[1]);
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
