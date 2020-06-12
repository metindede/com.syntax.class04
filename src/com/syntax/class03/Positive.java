package com.syntax.class03;

import java.util.Scanner;

public class Positive {

	public static void main(String[] args) {
		// write a program to check whether number is positive or negative.
		// interview question: write a java program to check whether  number is Even or odd.

		Scanner scan = new Scanner(System.in);
		
		int number;
		
		System.out.println(" Enter number ..... : ");
		
		number = scan.nextInt();
		
	if (number > 0) {
		System.out.println(number + " is positive");
	} else if (number == 0) {
		System.out.println(number + " is 0");
	}	else  {
			System.out.println(number + " is negative");
	}	
	
	if (number  % 2 == 0) {
		System.out.println(number + " is even");
	}	else  {
			System.out.println(number + " is odd");
	}	
	}
}



