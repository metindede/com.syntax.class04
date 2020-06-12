package com.syntax.class03;

public class TemperatureCheck {

	public static void main(String[] args) {
		double t1 = 30;
		double t2 = 32;

		if (t1 < t2) {
			System.out.println("Water will freeze with temperature " + t1 + " F");
			
		} else { // otherwise
			System.out.println("Water will  NOT freeze with temperature " + t2 + " F");
		}	
	}
}