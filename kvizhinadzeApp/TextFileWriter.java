package kvizhinadzeApp;

import java.io.PrintWriter;
import java.util.List;

public class TextFileWriter {
	
	public static void write(String fileName, List<Student> students) {
		PrintWriter printWriter = null;
		try {
			printWriter = new PrintWriter(fileName, "UTF-8");
			for (int i = 0; i < students.size(); i++) {
				printWriter.print(students.get(i).getFirstName() + " ");
				printWriter.print(students.get(i).getLastName() + " ");
				printWriter.print(students.get(i).getDate() + ";");
				printWriter.println();
			}
			System.out.println("File Saved");
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			printWriter.close();
		}
	}
}
