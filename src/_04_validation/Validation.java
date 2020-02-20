//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _04_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(5);
		
		

		// 1. Use each value of randomNumber to give the user a random compliment.
		randomNumber = randomMaker.nextInt(10)+1;
		System.out.println(randomNumber);
		if (randomNumber == 1)
		JOptionPane.showMessageDialog(null, "Ur shirt is totes yeet yo");
		// 2. Repeat all the code above 10 times
		if (randomNumber == 2)
		JOptionPane.showMessageDialog(null, "Ur shirt is totes yeet yo");
		else if (randomNumber == 3)
		JOptionPane.showMessageDialog(null, "Splish spalsh ur opinion isnt trash");
		else if (randomNumber == 4)
		JOptionPane.showMessageDialog(null, "dont worry bro, we cant smell ur axe body spray for men");
		else if (randomNumber == 5)
		JOptionPane.showMessageDialog(null, "Ur shirt is totes yeet yo");
		else if (randomNumber == 6)
		JOptionPane.showMessageDialog(null, "Ur shirt is totes yeet yo");
		else if (randomNumber == 7)
		JOptionPane.showMessageDialog(null, "Ur shirt is totes yeet yo");
		else if (randomNumber == 8)
		JOptionPane.showMessageDialog(null, "Ur shirt is totes yeet yo");
		else if (randomNumber == 9)
		JOptionPane.showMessageDialog(null, "Ur shirt is totes yeet yo");
		else if (randomNumber == 10)
		JOptionPane.showMessageDialog(null, "Ur shirt is totes yeet yo");
		
		// 3. Find someone to test out your program. They will like it :)
	}
}
