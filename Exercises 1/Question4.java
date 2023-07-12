/*
Write a java program to convert height(feet & inches) to cm
*/

import java.util.Scanner;

class Question4 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your height in feet and inches : ");
		// get feet and height from user
		double feet = sc.nextDouble();
		double inches = sc.nextDouble();
		
		// convert feet and inches into cm
		double cm = (feet * 12 + inches) * 2.54;
		
		System.out.println("Your height in cm : " + cm);
	}
}