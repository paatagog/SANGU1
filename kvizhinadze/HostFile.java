package kvizhinadze;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class HostFile {
public static String INPUT_FILES = "C:/hosts";
	
	public static void main(String[] args){
		try{
			IpAddressChecker checker = new IpAddressChecker();
			List<String> lines = Files.readAllLines(Paths.get(INPUT_FILES), Charset.forName("UTF-8"));
			for(String line:lines){
				if (line != null && !line.trim().startsWith("#")) {
					String[] arr = line.split(" ");
					if (!checker.isMatch(arr[1], arr[0])) {
						System.out.println("Error: " + arr[0] + " " + arr[1]);
					}
				}
			}
		} catch (IOException e){
			e.printStackTrace();
		}

	}
	

}
