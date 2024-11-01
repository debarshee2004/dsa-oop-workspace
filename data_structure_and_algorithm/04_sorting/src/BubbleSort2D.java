public class BubbleSort2D {
    public static void main(String[] args) {
        int[][] array = {
                {5, 2, 9},
                {3, 6, 1},
                {8, 7, 4}
        };

        System.out.println("Original 2D Array:");
        print2DArray(array);

        // Flatten the 2D array, sort it, and then put it back into a 2D array
        bubbleSort2DArray(array);

        System.out.println("\nSorted 2D Array:");
        print2DArray(array);
    }

    // Method to flatten, sort, and reassign the 2D array elements
    public static void bubbleSort2DArray(int[][] array) {
        int rows = array.length;
        int cols = array[0].length;
        int size = rows * cols;

        // Flatten the 2D array into a 1D array
        int[] flatArray = new int[size];
        int index = 0;
        for (int[] row : array) {
            for (int element : row) {
                flatArray[index++] = element;
            }
        }

        // Bubble sort on the flattened 1D array
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (flatArray[j] > flatArray[j + 1]) {
                    // Swap the elements if they are in the wrong order
                    int temp = flatArray[j];
                    flatArray[j] = flatArray[j + 1];
                    flatArray[j + 1] = temp;
                }
            }
        }

        // Reassign the sorted elements back to the 2D array
        index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = flatArray[index++];
            }
        }
    }

    // Method to print a 2D array
    public static void print2DArray(int[][] array) {
        for (int[] row : array) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
