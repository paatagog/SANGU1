package gogishvili.swing;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Test {
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                SanguFrame ex = new SanguFrame();
                ex.setVisible(true);
            }
        });		
	}

}
