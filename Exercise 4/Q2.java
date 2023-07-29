// 2) Write a java method that will remove a given character from a string.

import java.util.Scanner;

class Q2 {
	
	static void check() {
		Scanner sc = new Scanner(System.in);
		
		// get string
		System.out.print("Enter a string : ");
		String word = sc.nextLine();
		
		//get the character to remove
		System.out.print("Enter the character to remove : ");
		char character = sc.next().charAt(0);
		
		// remove character using replace method
		word = word.replace(Character.toString(character), ""); 
		
		System.out.print("After removed : " + word);
	}
	
	public static void main(String[] args) {
		check();
	}
}