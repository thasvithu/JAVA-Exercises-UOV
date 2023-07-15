/*
4. Takes an integer value and return the number with its digits reverced. for example given number 7631, the method should return 1367.
*/

import java.util.Scanner;

public class Question4 {
	public static int digitsReverce() {
		Scanner sc = new Scanner(System.in);
		
		int number, reverce = 0;
	
		System.out.print("Enter a number : ");
		number = sc.nextInt();
		
		do {
			reverce = (reverce * 10) + (number % 10);
			number /= 10;
			
		}while(number != 0);
		
		return reverce;
	}
	
	public static void main(String[] args) {
		System.out.println("Reversed digits : " + digitsReverce());
	}
}