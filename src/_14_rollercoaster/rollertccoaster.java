package _14_rollercoaster;

import javax.swing.JOptionPane;

public class rollertccoaster {

	public static void main(String[] args) {
	
		
		String height =  JOptionPane.showInputDialog(null, "how tall are you?");
		
		int num= Integer.parseInt(height);
		
		if(num>48) {
			JOptionPane.showMessageDialog(null, "You can go in the rollercoater");
		}
		
		else if(num<48) {
			JOptionPane.showMessageDialog(null, "you need to grow more. youre too short.");
		
	}
}
}