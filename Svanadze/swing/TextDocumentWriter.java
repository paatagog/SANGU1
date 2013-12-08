package Svanadze.swing;

import java.io.File;
import java.io.PrintWriter;
import java.util.List;

public class TextDocumentWriter {

	public static void writer(String fileName, List<Student> students) throws Exception{
		PrintWriter out = new PrintWriter(new File(fileName));
		for (Student st : students) {
			out.println(st.getFirstName() + " " + st.getLastName() + " " + st.getAge());
		}
		out.close();
	}
}
