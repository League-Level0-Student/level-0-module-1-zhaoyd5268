//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package _01_random._5_magic_8_ball;

import java.util.Random;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below
public static void main(String[] args) {
	

	// 2. Get the user to enter a question for the 8 ball to answer
	Random ran = new Random();

	// 3. Make a variable and initialize it to a random number.
	//     ** You will need to make a random object!
	//     Limit the random numbers to be between 0 and 3
	int generation = ran.nextInt(4-0);
	
	// 4. If the random number is 0
if (generation==0) {
	System.out.println("Yes");
}
else if (generation==1) {
	System.out.println("No");
} else if (generation==2) {
	System.out.println("maybe you should ask Google?");
} else if (generation==3) {
	System.out.println("I don't know? Why are you asking me?");
}
	// -- tell the user "Yes"

	// 5. If the random number is 1

	// -- tell the user "No"

	// 6. If the random number is 2

	// -- tell the user "Maybe you should ask Google?"

	// 7. If the random number is 3

	// -- write your own answer
}
}
