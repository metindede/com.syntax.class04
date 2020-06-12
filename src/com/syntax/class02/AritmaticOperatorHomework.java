package com.syntax.class02;

public class AritmaticOperatorHomework {

	public static void main(String[] args) {
	
	double num1 = 14.0;
	double num2 = 3.5;
	double sum = num1 + num2;
	double sub = num1 - num2;
	double mult = num1 * num2;
	double div = num1 / num2;
	double num3 = 3.9;
	double sq1 = num3 * num3;
	int w = 5;
	int h = 8;
	int per = 2 * w + 2 * h;
	int area = w * h;
	
	System.out.println ("-------------------------------------------------------------------");
	System.out.println ("The add of 2 numbers " + num1 + " and " + num2 + " equal to " + sum);
	System.out.println ("-------------------------------------------------------------------");
	System.out.println ("The subtraction of 2 numbers " + num1 + " and " + num2 + " equal to " + sub);
	System.out.println ("-------------------------------------------------------------------");
	System.out.println ("The multiply of 2 numbers " + num1 + " and " + num2 + " equal to " + mult);
	System.out.println ("-------------------------------------------------------------------");
	System.out.println ("The divide of 2 numbers " + num1 + " and " + num2 + " equal to " + div);
	System.out.println ("-------------------------------------------------------------------");
	System.out.println ("-------------------------------------------------------------------");
	System.out.println("The square of the " + num3 + " is " + sq1);
	System.out.println ("-------------------------------------------------------------------");
	System.out.println("The perimeter of a rectangle with width " + w + " and height " + h + " is equal to " + per + " and the area is " + area);
	System.out.println ("-------------------------------------------------------------------");
	
	
	}
}