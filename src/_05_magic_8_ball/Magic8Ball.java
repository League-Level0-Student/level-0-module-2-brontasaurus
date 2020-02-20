//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package _05_magic_8_ball;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
public static void main(String[] args) {

	// 2. Make a variable that will hold a random number and put a random number into this variable using 
	//Random ram = new Random();
	
	int ran = new Random().nextInt(4);

	// 3. Print out this variable
System.out.println(ran);
	// 4. Get the user to enter a question for the 8 ball
JOptionPane.showInputDialog(null, "Place thine question here,\nat the feet the the great oracle EIGHT BALL,\nwho knows more than the heavems themselves,\nmore than life itself,\nonly defeated by the Universe in all its glory");
	// 5. If the random number is 0
if (ran == 0)
	// -- tell the user "Yes"
JOptionPane.showMessageDialog(null, "YEEEE haw");
	// 6. If the random number is 1
else if (ran == 1)
	// -- tell the user "No"
JOptionPane.showMessageDialog(null, "NAW FAM");
	// 7. If the random number is 2
else if (ran == 2)
	// -- tell the user "Maybe you should ask Google?"
JOptionPane.showMessageDialog(null, "Maybe you should ask Google?");
	// 8. If the random number is 3
else if (ran == 3)
	// 
JOptionPane.showMessageDialog(null, "That was a terrible question. You're wasting my time.");
}
}