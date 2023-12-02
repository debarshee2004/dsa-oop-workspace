"""
    The search function takes an array, its size, and a target value as input, and returns the index of
    the target value in the array if found, otherwise it returns -1.
    
    :param arr: The arr parameter is a list or array of elements in which we want to search for a
    specific element
    :param N: The parameter N represents the size of the array. It indicates the number of elements in
    the array that we want to search through
    :param x: The value we are searching for in the array
    :return: the index of the element 'x' in the array 'arr'. If 'x' is not found in the array, it
    returns -1.
"""

def search(arr, N, x): 

	for i in range(0, N): 
		if (arr[i] == x): 
			return i 
	return -1


# The code block `if __name__ == "__main__":` is used to check if the current script is being run
# directly or being imported as a module.
if __name__ == "__main__": 
	arr = [2, 3, 4, 10, 40] 
	x = 10
	N = len(arr) 

	# Function call 
	result = search(arr, N, x) 
	if(result == -1): 
		print("Element is not present in array") 
	else: 
		print("Element is present at index", result) 
