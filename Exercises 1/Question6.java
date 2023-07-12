/*
Write a java program to check a given number is even or odd
*/

import java.util.Scanner;

class Question6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		
		if (num % 2 == 0)
			System.out.println("The number is even");
		else
			System.out.println("The number is odd");
	}
}