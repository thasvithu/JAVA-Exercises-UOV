/*
2) * * * * *
   * * * *
   * * * 
   * *
   *
*/

class Question2 {
	public static void main(String[] args) {
		// outer loop
		for (int i = 1; i <= 5; i++) {
			// inner loop
			for (int j = 5; j >= i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}