package Svanadze.swing;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileRead {

	public static List<Student> read (String fileName) throws Exception{
		List<String> lines = Files.readAllLines(Paths.get(fileName),Charset.forName("UTF-8"));
		List<Student> students = new ArrayList<Student>();
		for (String line : lines) {
			String[] arr = line.split(" ");
			Student s = new Student();
			s.setFirstName(arr[0]);
			s.setLastName(arr[1]);
			s.setDate(arr[2]);
			students.add(s);
		}
		return students;
	} 
}
