package gogishvili.collections;

import gogishvili.classes.Student;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsTest {
	public static String INPUT_FILE = "d:/input.txt";
	public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	
	public static void main(String[] args) {
		 try {
			 	List<Student> students = new ArrayList <Student>();
	            List<String> lines = Files.readAllLines(Paths.get(INPUT_FILE), Charset.forName("UTF-8"));
	            for (String line : lines) {
	            	String[] arr = line.split(" ");
	            	Student s = new Student();
	            	s.setFirstName(arr[0]);
	            	s.setLastName(arr[1]);
	            	s.setPersonalNumber(arr[2]);
	            	s.setUniversity(arr[3]);
	            	s.setStartDate(sdf.parse(arr[4]));
	            	s.setBirthDate(sdf.parse(arr[5]));
	            	students.add(s);
	            }
	            Collections.sort(students, new StudentComparator1());
	            
	            for (Student s : students) {
					System.out.println(s);
				}
	        } catch (Exception e) {
	            e.printStackTrace();
	        }		
	}	

}
