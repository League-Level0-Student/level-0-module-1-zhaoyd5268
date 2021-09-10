package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class unbirthday {
public static void main(String[] args) {
	String Birthday=JOptionPane.showInputDialog("when is your Birthday. Answer in (mm/dd) format");
	if(Birthday.equals("9, 9")) {
		String merry=JOptionPane.showInputDialog(null,"Have a Merry Birthday with lots of presents and cake!");
	}else  {
		JOptionPane.showMessageDialog(null, "Have a great UNBIRTHDAY!!!");
		}
	
	
}
}
