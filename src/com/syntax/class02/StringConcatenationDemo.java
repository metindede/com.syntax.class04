package com.syntax.class02;

public class StringConcatenationDemo {

	public static void main(String[] args) {

		String name = "Metin";
		String lastName = "Dede";
		String grade = "A +";
		String city = "Lancaster";
		String state = "PA";
		int phoneNumber = 100101010;
		System.out.println(name);
		System.out.println(lastName);
		System.out.println(grade);
		System.out.println(city);
		System.out.println(state);
		System.out.println(phoneNumber);
		System.out.println("-----------------------------");
		System.out.println("Ahmet Akif Dede");

		System.out.println("-----------------------------");
		System.out.println("My name is " + name + " and my last name is " + lastName +'.');
		System.out.println("I live in city of " + city + " state " + state + " and my phone number is " + phoneNumber);

	}

}
