// 5. Create the multipplication table (from 1- 10) of a number.

import java.util.Scanner;

class Question5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " * " + num + " = " + (i * num));
		}
	}
}