/*
	2. Allows the users to enter exactly twwnty floting-point values. 
	   The program the prints the sum, average,(arithmetic means maximum, and minimum of the values enterd).
*/

import java.util.Scanner;

class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declare and initialize number array
        float[] numbers = new float[20];
        float sum = 0, average, maximum, minimum;

        // Get the numbers from the user
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter the number " + (i + 1) + ": ");
            numbers[i] = sc.nextFloat();
            sum += numbers[i]; // Calculate sum as numbers are entered
        }

        // Calculate the average
        average = sum / 20;

        // Find the maximum and minimum numbers
        maximum = numbers[0];
        minimum = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maximum) 
                maximum = numbers[i];
            if (numbers[i] < minimum)
                minimum = numbers[i];
        }

        // Display the results
        System.out.println("\nSum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Maximum: " + maximum);
        System.out.println("Minimum: " + minimum);
    }
}
