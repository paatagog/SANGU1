package gogishvili.excell;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ExcellTest {
	
	private static void log(String message) {
		System.out.println(new Date() + ": " + message);
	}
	
	public static void main(String[] args) {
		try {
			FileInputStream file = new FileInputStream(new File("C:/java/sources/gogishvili/excell/input.xls"));
			HSSFWorkbook workbook = new HSSFWorkbook(file);
			HSSFSheet sheet = workbook.getSheetAt(0);
			Iterator<Row> rowIterator = sheet.iterator();
			Row row  = rowIterator.next();
			Iterator<Cell> cellIterator = row.cellIterator();
			Cell cell = cellIterator.next();
			log("Cell(0,0) value is: " + cell.getStringCellValue());			
		} catch (Exception ex) {
			ex.printStackTrace();
			log("ERROR");
		}
	}
}
