package Svanadze.swing;

import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelWriter {
	
	public static void writer(String fileName, List<Student> students) throws Exception {
		FileOutputStream fileOut = new FileOutputStream(fileName);
		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet worksheet1 = workbook.createSheet();
		HSSFRow row1 = worksheet1.createRow(0);
		row1.createCell(0).setCellValue("სახელი");
		row1.createCell(1).setCellValue("გვარი");
		row1.createCell(2).setCellValue("ასაკი");
		for (int j = 0; j < students.size(); j++) {
			for (int i = 0; i < students.size(); i++) {
				HSSFRow row = worksheet1.createRow(i + 1);
				row.createCell(0).setCellValue(students.get(i).getFirstName());
				row.createCell(1).setCellValue(students.get(i).getLastName());
				int age = students.get(i).getAge();
				row.createCell(2).setCellValue(age);
			}
		}
		workbook.write(fileOut);
		fileOut.flush();
		fileOut.close();
	}

}
