import java.io.*; 

class GFG { 
	/**
	 * The search function takes an array, a size, and a target value as input, and returns the index of
	 * the target value in the array if found, or -1 if not found.
	 * 
	 * @param arr The arr parameter is an array of integers.
	 * @param N N is the size of the array. It represents the number of elements in the array.
	 * @param x The value that we are searching for in the array.
	 * @return The method is returning the index of the element 'x' in the array 'arr'. If 'x' is not
	 * found in the array, it returns -1.
	 */
	public static int search(int arr[], int N, int x) 
	{ 
		for (int i = 0; i < N; i++) { 
			if (arr[i] == x) 
				return i; 
		} 
		return -1; 
	} 


	/**
	 * The main function searches for a given element in an array and prints its index if found, or a
	 * message if not found.
	 * 
	 * @param args The args parameter is an array of strings that can be passed as command line arguments
	 * when running the program. In this case, it is not being used in the main method.
	 */
	public static void main(String args[]) 
	{ 
		int arr[] = { 2, 3, 4, 10, 40 }; 
		int x = 10; 

		// Function call 
		int result = search(arr, arr.length, x); 
		if (result == -1) 
			System.out.print( 
				"Element is not present in array"); 
		else
			System.out.print("Element is present at index "
							+ result); 
	} 
}
