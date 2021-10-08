package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {

	public static void main(String[] args) {
	


		for (int i=1; i<6; i++) {
			Random ran = new Random();
			int lotterygeneration = ran.nextInt(50);
			JOptionPane.showMessageDialog(null, lotterygeneration);

		}  

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}	
}
