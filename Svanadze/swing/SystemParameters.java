package Svanadze.swing;

public class SystemParameters {
	
	private static String INPUT_FILE = "D:/JAVA/sources/Svanadze/swing/input.txt";
    private static String OUTPUT_FILE = "D:/JAVA/sources/Svanadze/swing/output.txt";
    private static String EXCEL_OUTPUT_FILE = "D:/JAVA/sources/Svanadze/swing/output.xls";
    private static final String FILE_NAME = "D:/JAVA/sources/Svanadze/swing/output.xml";
    
    public void loadSystemParameters() {
    	inputFileName = INPUT_FILE;
    	outputExcelFileName = EXCEL_OUTPUT_FILE;
    	outputTextFileName = OUTPUT_FILE;
    	outputXMLFileName = FILE_NAME;
    }
    
    private String inputFileName;
    
    private String outputTextFileName;
    
    private String outputExcelFileName;

    private String outputXMLFileName;

	public String getInputFileName() {
		return inputFileName;
	}

	public void setInputFileName(String inputFileName) {
		this.inputFileName = inputFileName;
	}

	public String getOutputTextFileName() {
		return outputTextFileName;
	}

	public void setOutputTextFileName(String outputTextFileName) {
		this.outputTextFileName = outputTextFileName;
	}

	public String getOutputExcelFileName() {
		return outputExcelFileName;
	}

	public void setOutputExcelFileName(String outputExcelFileName) {
		this.outputExcelFileName = outputExcelFileName;
	}

	public String getOutputXMLFileName() {
		return outputXMLFileName;
	}

	public void setOutputXMLFileName(String outputXMLFileName) {
		this.outputXMLFileName = outputXMLFileName;
	}
    
    
}
