package kvizhinadzeApp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;


public class Interface extends JFrame{
	public List<students> students = new ArrayList<students>();	
	public Interface() {
			initGui();
		}
		public void initGui() {
			JPanel panel = new JPanel ();
			getContentPane().add(panel);
			
			panel.setLayout(null);
			
			
			JMenuBar menubar = new JMenuBar();
	        JMenu file = new JMenu("File");
	        ImageIcon exitIcon = new ImageIcon(getClass().getResource("resources\\exit.png"));
	        ImageIcon saveIcon = new ImageIcon(getClass().getResource("resources\\save.png"));
	        ImageIcon loadIcon = new ImageIcon(getClass().getResource("resources\\load.png"));
			file.setMnemonic(KeyEvent.VK_F);
			JMenuItem itemLoad = new JMenuItem("Load", loadIcon);
			itemLoad.setMnemonic(KeyEvent.VK_E);
			itemLoad.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent event) {
					String INPUT_FILES = "D:/kvizhinadze/textfile.txt";
						try{
							List<String> lines = Files.readAllLines(Paths.get(INPUT_FILES), Charset.forName("UTF-8"));
							
							for(String line:lines){
									String[] arr = line.split(" ");
									students s = new students();
									s.setFirstName(arr[0]);
									s.setLastName(arr[1]);
									s.setDate(arr[2]);
									students.add(s);
								}
							System.out.println("File Loaded");
						} catch (Exception e){
							e.printStackTrace();
						}
							
						
				}
			});
			
			JMenuItem itemSave = new JMenuItem("Save", saveIcon);
			itemSave.setMnemonic(KeyEvent.VK_E);
			itemSave.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent event) {
					 PrintWriter printWriter = null;
				        try {
				            // Will overwrite the file if exists or creates new
				            printWriter = new PrintWriter(
				                    "D:/kvizhinadze/created.txt", "UTF-8");
				            for (int i= 0; i < students.size(); i ++){
					            printWriter.print(students.get(i).getFirstName() + " ");
					            printWriter.print(students.get(i).getLastName() + " ");
					            printWriter.print(students.get(i).getDate() + ";");
					            printWriter.println();
				            }
							System.out.println("File Saved");
				            
				        } catch (FileNotFoundException fileNotFoundException) {
				            fileNotFoundException.printStackTrace();
				        } catch (UnsupportedEncodingException unsupportedEncodingException) {
				            unsupportedEncodingException.printStackTrace();
				        } finally {
				            printWriter.close();
				        }

	            }
			});
	        JMenuItem itemExit = new JMenuItem("Exit", exitIcon);
	        itemExit.setMnemonic(KeyEvent.VK_E);
	        itemExit.setToolTipText("Exit App");
	        itemExit.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent event) {
	                System.exit(0);
	            }
	        });
	        
	        file.add(itemLoad);
	        file.add(itemSave);
	        file.add(itemExit);
	        menubar.add(file);
	        setJMenuBar(menubar);
	       
	        setTitle("Load/Save Framme");
			setSize(300, 200);
			setLocationRelativeTo(null);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
	        
 		}
		
		
	}
