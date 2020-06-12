package com.syntax.class03;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		// Create a java program and declare int variable that will hold a month.
		// Based on the value of the variable your program should print the name of the month.
		// write a program to check whether number is positive or negative.
		// interview question: write a java program to check whether  number is Even or odd.

		
		Scanner scan = new Scanner(System.in);
		int monthNumber; 
		System.out.println(" Enter month number from 1 to 12..... : ");
		monthNumber = scan.nextInt();
		
		if (monthNumber == 1) {
			System.out.println("January");
		} else if (monthNumber == 2) {
			System.out.println("February");
		} else if (monthNumber == 3) {
			System.out.println("March");
		} else if (monthNumber == 4) {
			System.out.println("April");
		} else if (monthNumber == 5) {
			System.out.println("May");
		} else if (monthNumber == 6) {
			System.out.println("June");
		} else if (monthNumber == 7) {
			System.out.println("July");
		} else if (monthNumber == 8) {
			System.out.println("Auqust");
		} else if (monthNumber == 9) {
			System.out.println("September");
		} else if (monthNumber == 10) {
			System.out.println("October");
		} else if (monthNumber == 11) {
			System.out.println("November");
		} else if (monthNumber == 12) {
			System.out.println("December");
		
			
			int number;
			
			System.out.println(" Enter number ..... : ");
			number = scan.nextInt();
			
			
			
		if (number > 0) {
			System.out.println(number + " is positive");
		} else if (number == 0) {
			System.out.println(number + " Not positive Not Negative");
		}	else  {
				System.out.println(number + " is negative");
		}	
		}
	}
}


