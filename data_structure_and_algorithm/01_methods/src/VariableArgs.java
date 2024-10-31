public class VariableArgs {

    public static void main(String[] args) {
        // Calling the method with a different number of arguments
        displayNumbers(10);             // One argument
        displayNumbers(1, 2, 3);        // Three arguments
        displayNumbers(4, 5, 6, 7, 8);  // Five arguments

        // Using varargs with no arguments
        displayNumbers();               // No arguments
    }

    // Method using varargs to accept a variable number of int arguments
    public static void displayNumbers(int... numbers) {
        // Checking if no arguments were passed
        if (numbers.length == 0) {
            System.out.println("No numbers to display.");
        } else {
            System.out.print("Numbers: ");
            // Loop through the varargs array and display each number
            for (int num : numbers) {
                System.out.print(num + " ");
            }
            // New line for readability
            System.out.println();
        }
    }
}
