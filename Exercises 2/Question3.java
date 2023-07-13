/*
3. Simple calculator using if and/or switch Statement.
*/

import java.util.Scanner;


import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter a number: ");
        int num2 = sc.nextInt();

        System.out.print("Select the operator (+ - / *) : ");
        char operator = sc.next().charAt(0);

        int result;
	
		// using switch statement
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }

        System.out.println("Result: " + result);
	
		System.out.println("---------------------");
	
		// using if statement
        if (operator == '+')
            result = num1 + num2;
        else if (operator == '-')
            result = num1 - num2;
        else if (operator == '/')
            result = num1 / num2;
        else if (operator == '*')
            result = num1 * num2;
        else
            System.out.println("Invalid operator");
           
        System.out.println("Result: " + result);
    }
}

