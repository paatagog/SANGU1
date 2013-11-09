package lukino;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class DistanceMatch {
	
	public static String INPUT_FILE = "D:/Lukino/sources/lukino/pointlist.txt";
	
	public static void main(String[] args) {
		try {
			List<Point> pointlist = new ArrayList<Point>();
			List<String> lines = Files.readAllLines(Paths.get(INPUT_FILE), Charset.forName("default"));
			
			for (String line : lines) {
				String[] arr = line.split("\\s+");
				Point point = new Point();
				
				point.x = Double.parseDouble(arr[0]);
				point.y = Double.parseDouble(arr[1]);
				
				if (Distance.GetDistance(point) < 2){
					pointlist.add(point);
				}
				
				System.out.println(point);				
			}
			
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
