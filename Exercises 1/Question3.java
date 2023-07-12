/*
Write a java program to sum of the first n positive integers
*/

class Question3 {
	public static void main(String[] args) {
		int n = 10;
		int sum = 0;
		
		for (int i = 0; i <= n; i++) {
			sum = sum + i;
		}
		
		System.out.println("Sum of the first " + n + " positive integers is : " + sum);
	}
}