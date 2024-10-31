public class Function {

    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] numbers = {10, 20, 30, 40, 50};

        // Print the original array
        System.out.println("Original Array:");
        printArray(numbers);

        // Calculate and print the sum of the array elements
        int sum = calculateSum(numbers);
        System.out.println("Sum of array elements: " + sum);

        // Find and print the maximum element in the array
        int max = findMaximum(numbers);
        System.out.println("Maximum element: " + max);

        // Reverse the array and print it
        reverseArray(numbers);
        System.out.println("Reversed Array:");
        printArray(numbers);
    }

    // Function to print elements of an array
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println(); // New line for better output formatting
    }

    // Function to calculate the sum of elements in the array
    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum; // Return the total sum
    }

    // Function to find the maximum element in the array
    public static int findMaximum(int[] array) {
        int max = array[0]; // Assume the first element is the maximum
        for (int num : array) {
            if (num > max) {
                max = num; // Update max if a larger number is found
            }
        }
        return max; // Return the maximum value found
    }

    // Function to reverse the elements of the array
    public static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            // Swap elements at start and end
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
;
            // Move towards the middle
            start++;
            end--;
        }
    }
}
