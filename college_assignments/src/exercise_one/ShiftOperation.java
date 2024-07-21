package exercise_one;

import java.util.Scanner;

public class ShiftOperation {

    // This method multiplies the given number by 2 using bitwise left shift operations
    private static int multiply(int num) {
        int i = 2, ans = 0, count = 0;

        // Loop to handle the bitwise shifting and addition
        while (i > 0) {
            // If the least significant bit of i is 1, add (num shifted left by 'count') to ans
            if (i % 2 == 1) ans += num << count;
            count++;  // Increment the shift count
            i /= 2;   // Divide i by 2, effectively shifting it right by 1 bit
        }
        return ans;  // Return the calculated result
    }

    // This method divides the given product by 4 using bitwise right shift operations
    private static int divide(int product) {
        int i = 4, ans = 0, count = 0;

        // Loop to handle the bitwise shifting and addition
        while (i > 0) {
            // If the least significant bit of i is 1, add (product shifted right by 'count') to ans
            if (i % 2 == 1) ans += product >> count;
            count++;  // Increment the shift count
            i /= 2;   // Divide i by 2, effectively shifting it right by 1 bit
        }
        return ans;  // Return the calculated result
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create a Scanner object for user input
        System.out.print("Enter the number: ");
        int num = sc.nextInt();  // Read an integer input from the user

        int product = multiply(num);  // Call the multiply method and store the result
        int result = divide(product);  // Call the divide method and store the result

        System.out.println("The product is " + product);  // Print the product
        System.out.println("The result is " + result);    // Print the result of division
    }
}
