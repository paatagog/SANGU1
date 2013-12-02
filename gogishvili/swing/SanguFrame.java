package gogishvili.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class SanguFrame extends JFrame {
	public SanguFrame() {
		initGui();
	}
	
	private void initGui() {
	
		JPanel panel = new JPanel();
		getContentPane().add(panel);

		panel.setLayout(null);

		JButton quitButton = new JButton("ღილაკი");

		quitButton.setBounds(50, 60, 100, 30);
		quitButton.setToolTipText("ეს არის ფანჯრის დახურვის ღილაკი");

		quitButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				System.exit(0);
			}
		});

		panel.add(quitButton);


		

		JMenuBar menubar = new JMenuBar();
        ImageIcon icon = new ImageIcon(getClass().getResource("resources\\exit.png"));
        JMenu file = new JMenu("File");
        file.setMnemonic(KeyEvent.VK_F);
        JMenuItem eMenuItem = new JMenuItem("Exit", icon);
        eMenuItem.setMnemonic(KeyEvent.VK_E);
        eMenuItem.setToolTipText("Exit application");
        eMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                System.exit(0);
            }
        });

        file.add(eMenuItem);
        menubar.add(file);
        setJMenuBar(menubar);
       
        
        setTitle("Sangu Frame");
		setSize(300, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
			
	}

}
