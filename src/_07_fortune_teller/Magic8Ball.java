package _07_fortune_teller;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */


import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
public static void main(String[] args) {
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
int lolran = new Random().nextInt(4);
	// 3. Print out this variable
System.out.println(lolran);
	// 4. Get the user to enter a question for the 8 ball
//JOptionPane.showInputDialog("What is your question for the all mighty 8-Ball?!");
	// 5. If the random number is 0
if(lolran==0) {
	JOptionPane.showMessageDialog(null, "Yes!");
}
	// -- tell the user "Yes"
//done
	// 6. If the random number is 1
if(lolran==1) {
	JOptionPane.showMessageDialog(null, "No!");
}
	// -- tell the user "No"
//done
	// 7. If the random number is 2
if(lolran==2) {
	JOptionPane.showMessageDialog(null, "Maybe you should ask Google?!?!");
}
	// -- tell the user "Maybe you should ask Google?"
//done
	// 8. If the random number is 3
if(lolran==3) {
	JOptionPane.showMessageDialog(null, "I don't know, why are you asking me? I just want your money!");
}
	// -- write your own answer
//done
}
}
