package com.syntax.class04;

import java.util.Scanner;

public class CreditCardBons {

	public static void main(String[] args) {

		// Create a Java program that will ask if user has a credit card or not.
		// If the you user does not have a credit card then offer them.
		// If they do have one ask what is balance on the card?
		// If balance of the card is larger than 1000,
		// tell them to pay off immediately,
		// otherwise you can tell them that they can spend more.
		// Write a program to ask user to enter numbers of worked years and annual
		// salary.
		// If user worked for more or equals to 5 years than user is eligible for the
		// bonus, otherwise he is not. Once user is
		// eligible and salary is larger than 50000 than bonus = 5000, otherwise
		// bonus=3000.

		// Credit card

		Scanner scan = new Scanner(System.in);
		boolean cc;

		System.out.println(" Do you have a credit card);");
		cc = scan.nextBoolean();

		if (cc) {
			System.out.println("what is your credit card balance");
			
			double balance = scan.nextDouble();
			
			if (balance > 1000) {
				System.out.println("Please pay off immediately");
			} else {
				System.out.println("you can more spend");
			}

		} else {
			System.out.println(" do you want our best credit card));");
		}

	}
}
