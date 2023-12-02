// Java implementation of the approach
class GFG {

	// Function to search x in the given array
/**
 * The `sentinelSearch` function searches for a given key in an array using the sentinel search
 * algorithm and prints the index where the key is found or "Element Not found" if the key is not
 * present.
 * 
 * @param arr The array in which the element is to be searched.
 * @param n The size of the array
 * @param key The element that we are searching for in the array.
 */
	static void sentinelSearch(int arr[], int n, int key)
	{

		// Last element of the array
		int last = arr[n - 1];

		// Element to be searched is
		// placed at the last index
		arr[n - 1] = key;
		int i = 0;

		while (arr[i] != key)
			i++;

		// Put the last element back
		arr[n - 1] = last;

		if ((i < n - 1) || (arr[n - 1] == key))
			System.out.println(key + " is present at index "
							+ i);
		else
			System.out.println("Element Not found");
	}

	// Driver code
/**
 * The main function in Java initializes an array of integers, sets the length of the array, and
 * searches for a specific key using the sentinel search algorithm.
 */
	public static void main(String[] args)
	{
		int arr[]
			= { 10, 20, 180, 30, 60, 50, 110, 100, 70 };
		int n = arr.length;
		int key = 180;

		sentinelSearch(arr, n, key);
	}
}
