package lukino.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Frame extends JFrame {
	private List<Student> students = new ArrayList<Student>();
	private static File outputFile = new File(FileReadWrite.OUTPUT_FILE);
	private static PrintWriter out;

	public Frame() {
		initGui();
	}

	private void initGui() {

		JPanel panel = new JPanel();
		getContentPane().add(panel);

		panel.setLayout(null);

		String excelString = "Excel";
		String xmlString = "XML";
		String textString = "Text Document";
		
		final AbstractButton excelButton = new JRadioButton(excelString);
		final AbstractButton xmlButton = new JRadioButton(xmlString);
		final AbstractButton textButton = new JRadioButton(textString);

		excelButton.setBounds(10,10,20,20);
		xmlButton.setBounds(10,40,20,20);
		textButton.setBounds(10,70,20,20);
		
		excelButton.setMnemonic(KeyEvent.VK_E);
		xmlButton.setMnemonic(KeyEvent.VK_X);
		textButton.setMnemonic(KeyEvent.VK_T);
		
		ButtonGroup btnGroup = new ButtonGroup();

		excelButton.setSelected(false);
		xmlButton.setSelected(false);
		textButton.setSelected(true);

		btnGroup.add(excelButton);
		btnGroup.add(xmlButton);
		btnGroup.add(textButton);
		
		panel.add(excelButton);
		panel.add(xmlButton);
		panel.add(textButton);

		JMenuBar menubar = new JMenuBar();

		ImageIcon loadIcon = new ImageIcon(getClass().getResource("resources\\load.jpg"));
		ImageIcon saveIcon = new ImageIcon(getClass().getResource("resources\\save.gif"));
		ImageIcon exitIcon = new ImageIcon(getClass().getResource("resources\\exit.png"));

		JMenu file = new JMenu("File");
		file.setMnemonic(KeyEvent.VK_F);
		JMenuItem lMenuItem = new JMenuItem("Load", loadIcon);
		JMenuItem sMenuItem = new JMenuItem("Save", saveIcon);
		JMenuItem eMenuItem = new JMenuItem("Exit", exitIcon);

		lMenuItem.setMnemonic(KeyEvent.VK_L);
		lMenuItem.setToolTipText("Load file");
		lMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				try {
					List<String> lines = Files.readAllLines(Paths.get(FileReadWrite.INPUT_FILE),Charset.forName("UTF-8"));
					for (String line : lines) {
						String[] arr = line.split(" ");
						Student s = new Student();
						s.setFirstName(arr[0]);
						s.setLastName(arr[1]);
						s.setDate(arr[2]);
						students.add(s);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

		sMenuItem.setMnemonic(KeyEvent.VK_S);
		sMenuItem.setToolTipText("Save file");
		sMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				try {
					if (textButton.isSelected()) {
						out = new PrintWriter(outputFile);
						for (Student st : students) {
							out.println(st.getFirstName() + " " + st.getLastName() + " " + st.getAge(st.getDate()));
						}
						out.close();
					} else if (excelButton.isSelected()) {
						FileOutputStream fileOut = new FileOutputStream(FileReadWrite.EXCEL_OUTPUT_FILE);
						HSSFWorkbook workbook = new HSSFWorkbook();
						HSSFSheet worksheet1 = workbook.createSheet();
						HSSFRow row1 = worksheet1.createRow(0);
						row1.createCell(0).setCellValue("First Name");
						row1.createCell(1).setCellValue("Last Name");
						row1.createCell(2).setCellValue("Age");
						for (int j = 0; j < students.size(); j++) {
							for (int i = 0; i < students.size(); i++) {
								HSSFRow row = worksheet1.createRow(i + 1);
								row.createCell(0).setCellValue(students.get(i).getFirstName());
								row.createCell(1).setCellValue(students.get(i).getLastName());
								int age = students.get(i).getAge(students.get(i).getDate());
								row.createCell(2).setCellValue(age);
							}
						}
						workbook.write(fileOut);
						fileOut.flush();
						fileOut.close();
					} else if (xmlButton.isSelected()) {
						for (Student st : students) {
							XMLWriter.serialize(st);
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

		eMenuItem.setMnemonic(KeyEvent.VK_E);
		eMenuItem.setToolTipText("Exit application");
		eMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				System.exit(0);
			}
		});

		file.add(lMenuItem);
		file.add(sMenuItem);
		file.add(eMenuItem);

		menubar.add(file);
		setJMenuBar(menubar);

		setTitle("Frame");
		setSize(300, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}
}
