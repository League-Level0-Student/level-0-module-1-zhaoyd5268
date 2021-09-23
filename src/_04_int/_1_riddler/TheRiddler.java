package _04_int._1_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;
String answer1 = "A coffin";
String answer2 = "A piano";
String answer3 = "A road";
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String question1 = JOptionPane.showInputDialog("Who makes it, has no need of it.\r\n" + 
		"Who buys it, has no use for it.\r\n" + 
		"Who uses it can neither see nor feel it.\r\n" + 
		"What is it?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (question1.equalsIgnoreCase(answer1)) {
	JOptionPane.showMessageDialog(null, "Correct. +1 point");
score += 1;
}else {
	JOptionPane.showMessageDialog(null, "Incorrect, next question. no point. answer was A COFFIN");
}
		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles
String question2 = JOptionPane.showInputDialog("What has many keys but can't open a single lock?");
	if (question2.equalsIgnoreCase(answer2)) {
		JOptionPane.showMessageDialog(null, "Correct, +1 point");
	score += 1;
	}else {
		JOptionPane.showMessageDialog(null, "incorrect, no point. answer was A PIANO");
	}

	
	String question3 = JOptionPane.showInputDialog(null, "What goes through cities and fields, but never moves?");
	if (question3.equalsIgnoreCase(answer3)) {
		JOptionPane.showMessageDialog(null, "Correct, +1 point.");
	score += 1;
	}else JOptionPane.showMessageDialog(null, "incorrect, no point. correct answer was A ROAD");

	// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "score is " + score);
	}
}

