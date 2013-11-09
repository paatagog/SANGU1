package kvizhinadze;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PointReader {
	public static double d = 14;
	public static String INPUT_FILE = "D:/kvizhinadze/java/Sangu/sources/inputPoint.txt";

	public static void main(String[] args) {
		try {
			List<Point> points = new ArrayList<Point>();
			List<String> lines = Files.readAllLines(Paths.get(INPUT_FILE),
					Charset.forName("UTF-8"));
			for (String line : lines) {
				String[] arr = line.split(" ");
				Point point = new Point();
				point.setX(Double.parseDouble(arr[0]));
				point.setY(Double.parseDouble(arr[1]));
				if (point.distanceFromCenter() <= d) {
					points.add(point);
					System.out.println(point);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();

		}
	}
}
