#include <stdio.h> 

/**
 * The function "search" takes an array, its size, and a target value as input, and returns the index
 * of the target value in the array if found, otherwise it returns -1.
 * 
 * @param arr An array of integers that we want to search through.
 * @param N N is the size of the array arr[]. It represents the number of elements in the array.
 * @param x The value that we are searching for in the array.
 * 
 * @return the index of the element 'x' in the array 'arr'. If 'x' is not found in the array, it
 * returns -1.
 */
int search(int arr[], int N, int x) 
{ 
	for (int i = 0; i < N; i++) 
		if (arr[i] == x) 
			return i; 
	return -1; 
}  
/**
 * The main function searches for an element in an array and prints its index if found.
 * 
 * @return The function search() is being called and it returns the index of the element x in the array
 * arr[]. If the element is not present in the array, it returns -1.
 */
int main(void) 
{ 
	int arr[] = { 2, 3, 4, 10, 40 }; 
	int x = 10; 
	int N = sizeof(arr) / sizeof(arr[0]); 

	// Function call 
	int result = search(arr, N, x); 
	(result == -1) 
		? printf("Element is not present in array") 
		: printf("Element is present at index %d", result); 
	return 0; 
}
