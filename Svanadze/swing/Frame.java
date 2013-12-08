package Svanadze.swing;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
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

@SuppressWarnings("serial")
public class Frame extends JFrame {

	private List<Student> students = new ArrayList<Student>();
	
	private SystemParameters systemParameters;

	public Frame() {
		initSystemParameters();
		initGui();
	}
	
	private void initSystemParameters() {
		systemParameters = new SystemParameters();
		systemParameters.loadSystemParameters();
	}

	private void initGui() {

		JPanel panel = new JPanel();
		getContentPane().add(panel);
		
		panel.setLayout(null);
		
		final StatusBar statusBar = new StatusBar();
		statusBar.setMessage("გახსენით ფაილი");
		getContentPane().add(statusBar, BorderLayout.SOUTH);
		
		final AbstractButton excelButton = new JRadioButton("Excel");
		final AbstractButton xmlButton = new JRadioButton("XML");
		final AbstractButton textButton = new JRadioButton("Text Document");
		
		excelButton.setBounds(10,10,150,20);
		xmlButton.setBounds(10,40,150,20);
		textButton.setBounds(10,70,150,20);
		
		excelButton.setMnemonic(KeyEvent.VK_E);
		xmlButton.setMnemonic(KeyEvent.VK_X);
		textButton.setMnemonic(KeyEvent.VK_T);
		
		ButtonGroup btnGroup = new ButtonGroup();

		excelButton.setSelected(false);
		xmlButton.setSelected(false);
		textButton.setSelected(false);

		btnGroup.add(excelButton);
		btnGroup.add(xmlButton);
		btnGroup.add(textButton);
		
		panel.add(excelButton);
		panel.add(xmlButton);
		panel.add(textButton);

		JMenuBar menubar = new JMenuBar();

		ImageIcon loadIcon = new ImageIcon(getClass().getResource("resources\\open.png"));
		ImageIcon saveIcon = new ImageIcon(getClass().getResource("resources\\save.png"));
		ImageIcon exitIcon = new ImageIcon(getClass().getResource("resources\\exit.png"));

		JMenu file = new JMenu("File");
		file.setMnemonic(KeyEvent.VK_F);
		JMenuItem lMenuItem = new JMenuItem("გახსნა", loadIcon);
		JMenuItem sMenuItem = new JMenuItem("შენახვა", saveIcon);
		JMenuItem eMenuItem = new JMenuItem("გამოსვლა", exitIcon);
		
		lMenuItem.setMnemonic(KeyEvent.VK_L);
		lMenuItem.setToolTipText("ფაილის გახსნა");
		lMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				try {
					students = FileRead.read(systemParameters.getInputFileName());
					statusBar.setMessage("ფაილი გახსნილია");
				} catch (Exception e) {
					statusBar.setMessage("შეცდომა ფაილის გახსნისას!");
					e.printStackTrace();
				}
			}
		});

		sMenuItem.setMnemonic(KeyEvent.VK_S);
		sMenuItem.setToolTipText("ფაილის შენახვა");
		sMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				try {
					if (textButton.isSelected()) {
						TextDocumentWriter.writer(systemParameters.getOutputTextFileName(),students);
						statusBar.setMessage("ფაილი შენახულია: " + systemParameters.getOutputTextFileName());
					} else if (excelButton.isSelected()) {
						ExcelWriter.writer(systemParameters.getOutputExcelFileName(), students);
						statusBar.setMessage("ფაილი შენახულია: " + systemParameters.getOutputExcelFileName());
					} else if (xmlButton.isSelected()) {
						StudentList list = new StudentList();
						list.setStudents(students);
						XMLWriter.serialize(systemParameters.getOutputXMLFileName(), list);
						statusBar.setMessage("ფაილი შენახულია: " + systemParameters.getOutputXMLFileName());
					}
				}catch (Exception e) {
					statusBar.setMessage("შეცდომა ფაილის შენახვისას!");
					e.printStackTrace();
				}
			}
		});

		eMenuItem.setMnemonic(KeyEvent.VK_E);
		eMenuItem.setToolTipText("ფანჯრის დახურვა");
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
		
		setTitle("Frame-ის მაგალითი");
		setSize(400, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}
}
