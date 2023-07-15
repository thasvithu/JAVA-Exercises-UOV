/*
3)         *
   	     * * 
       * * *
     * * * *
   * * * * *
   
*/

class Question3 {
    public static void main(String[] args) {
        // outer loop
        for (int i = 1; i <= 5; i++) {
            // space loop
            for (int j = 4; j >= i; j--) {
                System.out.print("  ");
            }
            //* loop
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
