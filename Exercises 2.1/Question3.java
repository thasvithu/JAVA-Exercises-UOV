/*
3. Allows a user to enter any number of non-negative integers. 
when the user enters a negative number/values the program no longer accepts input, and it dipalys the sum of the all the non-negative numbers is the entry, the sum is zero.
*/

import java.util.Scanner;

class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number, sum = 0;

        while (true) {
            System.out.print("Enter a number: ");
            number = sc.nextInt();

            if (number >= 0)
                sum += number;
            else {
                System.out.println("Sum: " + sum);
                break;
            }
        }
    }
}
