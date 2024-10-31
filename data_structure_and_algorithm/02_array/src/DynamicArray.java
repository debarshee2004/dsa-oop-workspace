import java.util.ArrayList;

public class DynamicArray {

    public static void main(String[] args) {
        // Creating a dynamic array (ArrayList) of integers
        ArrayList<Integer> dynamicArray = new ArrayList<>();

        // Adding elements to the dynamic array
        dynamicArray.add(10);
        dynamicArray.add(20);
        dynamicArray.add(30);
        System.out.println("After adding elements: " + dynamicArray);

        // Accessing elements in the dynamic array
        System.out.println("Element at index 1: " + dynamicArray.get(1));

        // Modifying an element in the dynamic array
        dynamicArray.set(1, 25);
        System.out.println("After modifying index 1: " + dynamicArray);

        // Removing an element from the dynamic array
        dynamicArray.remove(0);
        System.out.println("After removing index 0: " + dynamicArray);

        // Checking the size of the dynamic array
        System.out.println("Size of dynamic array: " + dynamicArray.size());

        // Iterating over elements in the dynamic array
        System.out.print("Iterating over elements: ");
        for (int number : dynamicArray) {
            System.out.print(number + " ");
        }
    }
}
