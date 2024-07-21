package exercise_one;

import java.util.Scanner;

public class NumberSwap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        // Swapping the values of num1 and num2 using bitwise XOR operation
        num1 = num1 ^ num2; // Step 1: num1 now holds the result of num1 XOR num2
        num2 = num1 ^ num2; // Step 2: num2 now holds the original value of num1
        num1 = num1 ^ num2; // Step 3: num1 now holds the original value of num2

        System.out.println("The first number: " + num1 + "\nThe second number: " + num2);
    }
}
