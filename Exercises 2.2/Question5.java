/*

5)     * 
     * * *  
   * * * * *
     * * * 
       * 
*/

class Question5 {
    public static void main(String[] args) {
        // upper half of the pattern
        for (int i = 1; i <= 3; i++) {
            // space loop
            for (int j = 3; j >= i; j--) {
                System.out.print("  ");
            }
            // asterisk loop
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // lower half of the pattern
        for (int i = 2; i >= 1; i--) {
            // space loop
            for (int j = 2; j >= i; j--) {
                System.out.print("   ");
            }
            // asterisk loop
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
