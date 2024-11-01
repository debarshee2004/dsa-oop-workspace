public class SelectionSort2D {
    public static void main(String[] args) {
        int[][] array = {
                {29, 10, 14, 37, 13},
                {20, 2, 78, 91, 22},
                {5, 3, 11, 9, 15}
        };

        System.out.println("Original Array:");
        printArray(array);

        // Apply selection sort on each row individually
        for (int i = 0; i < array.length; i++) {
            selectionSort(array[i]);
        }

        System.out.println("\nArray After Selection Sort on Each Row:");
        printArray(array);
    }

    // Method to perform selection sort on a 1D array (a single row of a 2D array)
    public static void selectionSort(int[] row) {
        int n = row.length;

        // Iterate through each element in the row
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // Find the index of the smallest element in the remaining unsorted part
            for (int j = i + 1; j < n; j++) {
                if (row[j] < row[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the current element at index i
            int temp = row[minIndex];
            row[minIndex] = row[i];
            row[i] = temp;
        }
    }

    // Helper method to print a 2D array
    public static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
