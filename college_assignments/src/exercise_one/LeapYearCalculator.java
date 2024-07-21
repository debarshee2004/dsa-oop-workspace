package exercise_one;

import java.util.Scanner;

public class LeapYearCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = sc.nextInt();

        // Checks if the year is a leap year
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Leap Year");  // Prints "Leap Year" if the condition is true
        } else {
            System.out.println("Not a leap year");  // Prints "Not a leap year" if the condition is false
        }
    }
}
