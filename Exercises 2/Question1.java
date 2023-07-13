/*
Find the maximum of two numbers. Modify these to three and four numbers.
*/

class Question1 {
	public static void main(String[] args) {
		int a = 20, b = 35, c = 30, d = 25;
		
		
		// for 2 numbers
		if (a > d)
			System.out.println("max num is : " + a);
		else
			System.out.println("max num is : " + d);
		
		
		// for 3 numbers
		if (a > b) {
			if (a > c)
				System.out.println("max num is : " + a);
			else	
				System.out.println("max num is : " + c);
		}else {
			if (b > c)
				System.out.println("max num is : " + b);
			else	
				System.out.println("max num is : " + c);
		}
		
		
		// for 4 numbers
		if (a > b) {
			if ( a > c) {
				if (a > d)
					System.out.println("max num is : " + a);
				else
					System.out.println("max num is : " + d);
			}else {
				if (c > d)
					System.out.println("max num is : " + c);
				else
					System.out.println("max num is : " + d);
			}
				
		}else {
			if ( b > c) {
				if (b > d)
					System.out.println("max num is : " + b);
				else
					System.out.println("max num is : " + d);
			}else {
				if (c > d)
					System.out.println("max num is : " + c);
				else
					System.out.println("max num is : " + d);
			}
		}
	}
}
