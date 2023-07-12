/* 
1.Write a Java program convert the given temperature from degrees Fahrenheit(F) to degrees Celsius(C).
C = 5/9(F – 32)
*/

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter the temperature in Fahrenheit : ");
        double temperature = sc.nextDouble();

        double celsius = (5.0 * (temperature - 32.0)) / 9.0;

        System.out.println("Temperature in degrees Celsius: " + celsius);

        sc.close();
    }
}