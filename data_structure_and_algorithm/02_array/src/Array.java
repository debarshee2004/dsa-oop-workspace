public class Array {

    public static void main(String[] args) {
        // 1. Declaration and Initialization of Arrays
        int[] numbers = new int[5];  // Declaring an integer array of size 5
        numbers[0] = 10;  // Initializing array elements
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // Alternative way to declare and initialize an array
        String[] names = {"Alice", "Bob", "Charlie"};

        // 2. Accessing Array Elements
        System.out.println("First element in numbers array: " + numbers[0]);
        System.out.println("Second element in names array: " + names[1]);

        // 3. Looping Through Arrays
        System.out.println("\nLooping through numbers array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        System.out.println("\nLooping through names array using enhanced for loop:");
        for (String name : names) {
            System.out.println(name);
        }

        // 4. Multidimensional Arrays (e.g., 2D array)
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("\n2D Array (Matrix):");
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();  // New line for each row
        }
    }
}
