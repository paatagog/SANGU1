package Svanadze.files;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import Svanadze.classes.Point;

public class FileTest {
	public static String INPUT_FILE = "c:/java/sources/Svanadze/files/fileinput.txt";

	public static void main(String[] args) {
		try {
			List<Point> points = new ArrayList<Point>();
			List<String> lines = Files.readAllLines(Paths.get(INPUT_FILE),
					Charset.forName("UTF-8"));
			double d = 5;
			for (String line : lines) {
				String[] arr = line.split(" ");
				Point p = new Point();
				p.setX(Double.parseDouble(arr[0]));
				p.setY(Double.parseDouble(arr[1]));
				if (p.distance() <= d) {
					points.add(p);
				}
			}
			System.out.print(points);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
