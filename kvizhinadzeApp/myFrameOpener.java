package kvizhinadzeApp;


import javax.swing.SwingUtilities;

public class myFrameOpener {
	public static void main (String[] args){
		SwingUtilities.invokeLater(new Runnable(){
			@Override
			public void run () {
				Interface ex = new Interface();
				ex.setVisible(true);
			}
			
		});
	}
}
