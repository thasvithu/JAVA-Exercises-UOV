/*
4. Check the year is leap year or not if (year % 400 == 0 or ( year % 100 = 0 and year % 4 == 0)) than leap year otherwise not a leap year.
*/

class Question4 {
	public static void main(String[] args) {
		int year = 2023;
		
		if (year % 400 == 0)
			System.out.println(year + " is a leap year.");
		else if (year % 100 != 0 && year % 4 == 0)
			System.out.println(year + " is a leap year.");
		else 
			System.out.println(year + " is not a leap year.");
	}
}
