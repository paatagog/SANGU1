package Svanadze.swing;

import javax.swing.SwingUtilities;

public class Test {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				Frame ex = new Frame();
				ex.setVisible(true);
			}
		});
	}
}
