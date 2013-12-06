package kvizhinadzeApp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class Interface extends JFrame{
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
			file.setMnemonic(KeyEvent.VK_F);
			JMenuItem itemLoad = new JMenuItem("Load");
			itemLoad.setMnemonic(KeyEvent.VK_E);
			itemLoad.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent event) {
					String INPUT_FILES = "D:/kvihzinadze/textfile.txt";
						try{
							List<String> lines = Files.readAllLines(Paths.get(INPUT_FILES), Charset.forName("UTF-8"));
							for(String line:lines){
								System.out.println(line);
							}
						} catch (IOException e){
							e.printStackTrace();
						}
							
						
				}
			});
			
			JMenuItem itemSave = new JMenuItem("Save");
			itemSave.setMnemonic(KeyEvent.VK_E);
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
