// 1) Write a java method to check if an input String is a palindrom.

import java.util.Scanner;

class Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter string : ");
		String word = sc.next();
		
		int wordLength = word.length();
		boolean flag = true;
		
		//In Java, you cannot access characters in a string using array notation.
		for (int i = 0; i < wordLength / 2; i++) {
			if (word.charAt(i) != word.charAt(wordLength - 1)) {
				flag = false;
				break;
			}
		}
		
		if (flag)
			System.out.println("Entered string is a palindrom");
		else
			System.out.println("Entered string is not a palindrom");
	}
}