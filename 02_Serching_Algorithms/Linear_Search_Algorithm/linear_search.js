/**
 * The function "search" takes an array, the length of the array, and a value to search for, and
 * returns the index of the value in the array if found, otherwise it returns -1.
 * @param arr - The arr parameter is an array of elements that we want to search through.
 * @param n - The parameter "n" represents the length of the array "arr".
 * @param x - The value we are searching for in the array.
 * @returns the index of the element 'x' in the array 'arr'. If the element is not found, it returns
 * -1.
 */
function search(arr, n, x) 
{ 
	for (let i = 0; i < n; i++) 
		if (arr[i] == x) 
			return i; 
	return -1; 
} 


/* The code is performing a linear search in an array to find a specific element. */
	let arr = [ 2, 3, 4, 10, 40 ]; 
	let x = 10; 
	let n = arr.length; 

	// Function call 
	let result = search(arr, n, x); 
	(result == -1) 
		? console.log("Element is not present in array") 
		: console.log("Element is present at index " + result); 