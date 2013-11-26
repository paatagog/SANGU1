package Svanadze.excell;

import java.io.FileInputStream;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcellFileRead {

	public static void log(String message) {
		System.out.println(new Date() + ": " + message);
	}

	public static String INPUT_FILE = "D:/JAVA/sources/Svanadze/excell/ExcellInputFile.xls";

	public static void main(String[] args) {
		try {
			FileInputStream file = new FileInputStream(INPUT_FILE);
			HSSFWorkbook wb = new HSSFWorkbook(file);
			HSSFSheet ws = wb.getSheetAt(0);

			int rowNum = ws.getLastRowNum() + 1;
			int colNum = ws.getRow(0).getLastCellNum();
			String[][] company = new String[rowNum][colNum];
			double[] money = new double[rowNum];

			for (int i = 1; i < rowNum; i++) {
				HSSFRow row = ws.getRow(i);
				for (int j = 0; j < colNum; j++) {
					HSSFCell cell = row.getCell(j);
					String value = cell.toString();
					company[i-1][j] = value;
				}
			}

			for (int i = 0; i < rowNum-1; i++) {
				money[i] = Double.parseDouble(company[i][1]) - Double.parseDouble(company[i][2]);
				System.out.println(company[i][0] + ": " + money[i]);
			}

		} catch (Exception ex) {
			ex.printStackTrace();
			log("ERROR");
		}
	}
}
