package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
String tim = "tim";
String ac = "ac";
String daniel = "daniel";
String timfact = "time likes mountainbiking";
String acfact = "ac is crazy";
String danielfact = "daniel likes cheese";
		// 2. Ask the user to enter a name. Store their answer in a variable.
String name = JOptionPane.showInputDialog("enter a name");
		// 3. In a pop-up, tell the user what is remarkable about that person. 
if (name.equalsIgnoreCase(daniel)) {
	JOptionPane.showMessageDialog(null, "fact is... " + danielfact);
}else if (name.equalsIgnoreCase(ac)) {
	JOptionPane.showMessageDialog(null, "fact is... " + acfact);
}else if (name.equalsIgnoreCase(tim)) {
	JOptionPane.showMessageDialog(null, "fact is... " + timfact);
}
}
	}

