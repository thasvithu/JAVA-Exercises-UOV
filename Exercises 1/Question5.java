/*
Write a java program compute the circumference of a circle given the radius entred by the user.
*/

import java.util.Scanner;

class Question5 {
	public static void main(String[] args) {
		final double PI = 3.14;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the circle radius : ");
		float radius = sc.nextFloat();
		
		System.out.println("Circumference of Circle is : " + (2 * PI * radius));
	}
}