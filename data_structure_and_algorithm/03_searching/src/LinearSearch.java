public class LinearSearch {

    // Method to perform linear search
    public static int linearSearch(int[] array, int target) {
        // Loop through each element in the array
        for (int i = 0; i < array.length; i++) {
            // Check if the current element matches the target
            if (array[i] == target) {
                return i; // Return the index if target is found
            }
        }
        // Return -1 if the target is not found in the array
        return -1;
    }

    public static void main(String[] args) {
        // Sample array to search in
        int[] numbers = {10, 20, 30, 40, 50};
        int target = 30;

        // Call the linear search method
        int result = linearSearch(numbers, target);

        // Output the result
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
