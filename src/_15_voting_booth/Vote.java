package _15_voting_booth;

import javax.swing.JOptionPane;

public class Vote {
public static void main(String[] args) {
	String age =  JOptionPane.showInputDialog(null, "how old are you?");
	
	int num= Integer.parseInt(age);
	
	if(num>18) {
		JOptionPane.showInputDialog(null, "Who should be the next president?");
	}
	
	else if(num<18) {
		JOptionPane.showMessageDialog(null, "Nobody cares what you think.");
	
}
}
}
