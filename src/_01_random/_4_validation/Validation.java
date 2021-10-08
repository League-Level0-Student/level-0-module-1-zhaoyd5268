//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._4_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(5);
		
	/////////////////// 	System.out.println(randomNumber);

		// 1. Use each value of randomNumber to give the user a random compliment.
Random ran = new Random();
int generation = ran.nextInt(4-0);
if (generation==0) {
	int i;
	for (i=0; i<11; i++) { 
			System.out.println("You will and always look beautiful!!!");
	}
	} else if (generation==1) {
		for (int i = 0; i<11; i++) { 
			System.out.println("You are the kindest person anyone will ever know!!!");
		}
} else if (generation==2) {
	for (int i = 0; i<10; i++) { 
	System.out.println("you always are positive about everything, even if the current thing in front of you isn't the best!!!");
	}} else if (generation==3) {
		for (int i = 0; i<11; i++) { 
		System.out.println("People look at you and SMILE!!!");
}
		}
		else if (generation==4) {
	for (int i = 0; i<11; i++) { 
		System.out.println("You work harder than everyone to be the best! GREAT JOB!!!");
	}
	}
	}
		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	

	private static Object i(int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}
}
