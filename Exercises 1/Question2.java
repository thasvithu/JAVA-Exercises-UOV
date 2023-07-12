/*
Write a java program convert the given Seconds to Day, Hours, Minutes and Seconds
*/


import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Seconds : ");
		int seconds = sc.nextInt();
		
		int days = seconds / (60 * 60 * 24);
		int remainingSeconds = seconds % (60 * 60 * 24);
		
		int hours = remainingSeconds / (60 * 60);
		remainingSeconds = remainingSeconds % (60 * 60);
		
		int minutes = remainingSeconds / 60;
		remainingSeconds = remainingSeconds % 60;
		
		System.out.println("Days    : " + days);
		System.out.println("Hours   : " + hours);
		System.out.println("Minutes : " + minutes);
		System.out.println("Seconds : " + remainingSeconds);
		
    }
}
