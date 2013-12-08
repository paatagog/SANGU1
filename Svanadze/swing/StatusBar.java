package Svanadze.swing;

import java.awt.Dimension;

import javax.swing.JLabel;

@SuppressWarnings("serial")
public class StatusBar extends JLabel {
    public StatusBar() {
    	super();
        super.setPreferredSize(new Dimension(300, 20));
    }
    
    public void setMessage(String message) {
        setText(" "+message);        
    }        
}