public class BinarySearch {
    // Method to perform binary search
    public static int binarySearch(int[] arr, int key) {
        int low = 0;                   // Start pointer
        int high = arr.length - 1;      // End pointer

        while (low <= high) {
            int mid = low + (high - low) / 2; // Middle index

            // Check if key is present at mid
            if (arr[mid] == key) {
                return mid; // Key found at index mid
            }
            // If key is greater, ignore left half
            if (arr[mid] < key) {
                low = mid + 1;
            }
            // If key is smaller, ignore right half
            else {
                high = mid - 1;
            }
        }
        // Key not found
        return -1;
    }

    public static void main(String[] args) {
        int[] sortedArray = {2, 3, 4, 10, 40};
        int key = 10;

        // Call binary search
        int result = binarySearch(sortedArray, key);

        if (result == -1) {
            System.out.println("Element not present in array");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
