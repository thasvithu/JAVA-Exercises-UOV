/*
2. Allows a user to type in an English numeric month of the year (1, 2, etc....). 
the program should print the expanded US English form (January, February....) if possible.
*/

import java.util.Scanner;

class Question2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the numeric number of the month(1 - 12) : ");
		int month = sc.nextInt();
		String monthName;
		
		switch (month) {
			case 1:
				monthName = "January";
				break;
			case 2:
				monthName = "February";
				break;
			case 3:
				monthName = "March";
				break;
			case 4:
				monthName = "April";
				break;
			case 5:
				monthName = "May";
				break;
			case 6:
				monthName = "June";
				break;
			case 7:
				monthName = "July";
				break;
			case 8:
				monthName = "August";
				break;
			case 9:
				monthName = "September";
				break;
			case 10:
				monthName = "October";
				break;
			case 11:
				monthName = "Noverber";
				break;
			case 12:
				monthName = "December";
				break;
			default:
				monthName = "Invalid input!";
				break;
		}
		System.out.println("Expanded US English Form : " + monthName);
	
		sc.close();
	}
	
}